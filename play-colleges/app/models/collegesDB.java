package models;

import play.db.*;
import javax.inject.*;
import java.sql.*;
import javax.sql.*;
import java.util.*;

@Singleton
public class collegesDB {

    public static class SchoolInfo {
        public String name;
        public String city;
        public String state;
        public int size;
        public int rank;
        public int tuition;
        public HashMap<String,ArrayList<Integer>> degrees;

        public SchoolInfo() {
        }
        public SchoolInfo(String name,String city,String state,int size,int rank,int tuition,HashMap<String,ArrayList<Integer>> degrees) {
            this.name = name;
            this.city = city;
            this.state = state;
            this.size = size;
            this.rank = rank;
            this.tuition = tuition;
            this.degrees = degrees;
        }
    }
    public static class CityInfo {
        public String name;
        public String state;
        public float latitude;
        public float longitude;
        public int population;
        public float medianResidentAge;
        public float HSDegree;
        public float medianIncome;
        public float belowPovertyLine;
        public float foreignBorn;
        public float crimeIndex;

        public CityInfo() {
        }
        public CityInfo(String name,String state,float latitude,float longitude,int population,float medianResidentAge,float HSDegree,float medianIncome,float belowPovertyLine,float foreignBorn,float crimeIndex) {
          this.name=name;
          this.state=state;
          this.latitude=latitude;
          this.longitude=longitude;
          this.population=population;
          this.medianResidentAge=medianResidentAge;
          this.HSDegree=HSDegree;
          this.medianIncome=medianIncome;
          this.belowPovertyLine=belowPovertyLine;
          this.foreignBorn=foreignBorn;
          this.crimeIndex=crimeIndex;
        }
    }

    private Database db;

    @Inject
    public collegesDB(Database db) {
        this.db = db;
    }

    public ArrayList<String> getAllNames(String table) throws SQLException {
      assert table.equals("School");
      Connection connection = null;
      ArrayList<String> names = new ArrayList<String>();
      try {
        connection = db.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT name FROM " + table + " ORDER BY name");
        while (rs.next()) {
          String name = rs.getString(1);
          names.add(name);
        }
        rs.close();
        statement.close();
      } finally {
        if (connection != null) {
          try {
            connection.close();
          } catch (Exception e) {
          }
        }
      }
      return names;
    }

    public ArrayList<String> getAllSchoolNames() throws SQLException {
      return getAllNames("School");
    }
    public CityInfo getCityInfo(String school_name) throws SQLException {
      Connection connection = null;
      CityInfo cityInfo = null;
      try {
        connection = db.getConnection();
        // retrieve cityInfo
        PreparedStatement statement = connection
        .prepareStatement("SELECT city_name, state FROM Location WHERE school_name = ?");
        statement.setString(1, school_name);
        ResultSet rs = statement.executeQuery();
        if (! rs.next()) {
          return null;
        }
        String cName = rs.getString(1);
        String sName = rs.getString(2);
        rs.close();
        statement.close();
        statement = connection
        .prepareStatement("SELECT * FROM City WHERE name=? AND state=?");
        statement.setString(1,cName);
        statement.setString(2,sName);
        rs = statement.executeQuery();
        if (! rs.next()) {
          return null;
        }
        float lat = rs.getFloat(3);
        float longit = rs.getFloat(4);
        int pop = rs.getInt(5);
        float medianResidentAge = rs.getFloat(6);
        float HSDegree = rs.getFloat(7);
        float medianIncome = rs.getFloat(8);
        float belowPovertyLine = rs.getFloat(9);
        float foreignBorn = rs.getFloat(10);
        float crimeIndex = rs.getFloat(11);
        rs.close();
        statement.close();
        cityInfo = new CityInfo(cName,sName,lat,longit,pop,medianResidentAge,HSDegree,medianIncome,belowPovertyLine,foreignBorn,crimeIndex);
      } finally {
        if (connection != null) {
          try {
            connection.close();
          } catch (Exception e) {
          }
        }
      }
      return cityInfo;
    }

    public SchoolInfo getSchoolInfo(String name) throws SQLException {
      Connection connection = null;
      SchoolInfo schoolInfo = null;
      try {
        connection = db.getConnection();
        // retrieve size:
        PreparedStatement statement = connection
        .prepareStatement("SELECT size FROM School WHERE name = ?");
        statement.setString(1, name);
        ResultSet rs = statement.executeQuery();
        if (! rs.next()) {
          return null;
        }
        int size = rs.getInt(1);
        rs.close();
        statement.close();
        // retrieve rank:
        statement = connection
        .prepareStatement("SELECT rank FROM School WHERE name = ?");
        statement.setString(1, name);
        rs = statement.executeQuery();
        if (! rs.next()) {
          return null;
        }
        int rank = rs.getInt(1);
        rs.close();
        statement.close();
        // retrieve tuition:
        statement = connection
        .prepareStatement("SELECT tuition FROM School WHERE name = ?");
        statement.setString(1, name);
        rs = statement.executeQuery();
        if (! rs.next()) {
          return null;
        }
        int tuition = rs.getInt(1);
        rs.close();
        statement.close();
        // retrieve city:
        statement = connection
        .prepareStatement("SELECT city_name FROM location JOIN school s ON s.name=school_name WHERE s.name = ?");
        statement.setString(1, name);
        rs = statement.executeQuery();
        if (! rs.next()) {
          return null;
        }
        String city = rs.getString(1);
        rs.close();
        statement.close();
        // retrieve state:
        statement = connection
        .prepareStatement("SELECT state FROM location JOIN school s ON s.name=school_name WHERE s.name = ?");
        statement.setString(1, name);
        rs = statement.executeQuery();
        if (! rs.next()) {
          return null;
        }
        String state = rs.getString(1);
        rs.close();
        statement.close();
        // retrive degrees and salaries
        ArrayList<String> school_degrees = new ArrayList<String>();
        ArrayList<Integer> sals;
        statement = connection
        .prepareStatement("SELECT degree_name FROM Offering WHERE school_name = ?");
        statement.setString(1,name);
        rs = statement.executeQuery();
        while(rs.next()) {
          String degree = rs.getString(1);
          school_degrees.add(degree);
        }
        rs.close();
        statement.close();
        HashMap<String,ArrayList<Integer>> degrees = new HashMap<String,ArrayList<Integer>>();
        for (String program : school_degrees) {
          statement = connection
          .prepareStatement("SELECT start_salary,tenyear_salary FROM Degree WHERE name = ?");
          statement.setString(1,program);
          rs = statement.executeQuery();
          if (! rs.next()) {
            return null;
          }
          sals = new ArrayList<Integer>();
          int start_sal = rs.getInt(1);
          int tenyr_sal = rs.getInt(2);
          sals.add(start_sal);
          sals.add(tenyr_sal);
          degrees.put(program,sals);
        }

        schoolInfo = new SchoolInfo(name,city,state,size,rank,tuition,degrees);
      } finally {
        if (connection != null) {
          try {
            connection.close();
          } catch (Exception e) {
          }
        }
      }
      return schoolInfo;
    }

    public ArrayList<String> getSimilarSizeSchoolInfo(String name) throws SQLException {
        Connection connection = null;
        SchoolInfo schoolInfo = null;
        ArrayList<String> similarSchools = new ArrayList<String>();
        try {
          connection = db.getConnection();
          // retrieve similar in size:
          PreparedStatement statement = connection
          .prepareStatement("SELECT s2.name, ABS(s1.size-s2.size) AS sizeDif FROM school s1 JOIN school s2 ON s1.name <> s2.name WHERE s1.name = ? AND ABS(s1.size-s2.size) < 2000 ORDER BY sizeDif LIMIT 10;");
          statement.setString(1, name);
          ResultSet rs = statement.executeQuery();
          while (rs.next()) {
            String school = rs.getString(1);
            similarSchools.add(school);
            }
          rs.close();
          statement.close();

        } finally {
          if (connection != null) {
            try {
              connection.close();
            } catch (Exception e) {
            }
          }
        }
        return similarSchools;
    }
    public ArrayList<String> getSimilarTuitionSchoolInfo(String name) throws SQLException {
        Connection connection = null;
        SchoolInfo schoolInfo = null;
        ArrayList<String> similarSchools = new ArrayList<String>();
        try {
          connection = db.getConnection();
          // retrieve similar in size:
          PreparedStatement statement = connection
          .prepareStatement("SELECT s2.name, ABS(s1.tuition-s2.tuition) AS tuitionDif FROM school s1 JOIN school s2 ON s1.name <> s2.name WHERE s1.name = ? AND ABS(s1.tuition-s2.tuition) < 5000 ORDER BY tuitionDif LIMIT 10;");
          statement.setString(1, name);
          ResultSet rs = statement.executeQuery();
          while (rs.next()) {
            String school = rs.getString(1);
            similarSchools.add(school);
            }
          rs.close();
          statement.close();

        } finally {
          if (connection != null) {
            try {
              connection.close();
            } catch (Exception e) {
            }
          }
        }
        return similarSchools;
    }
    public ArrayList<String> getCloseSchoolInfo(String name) throws SQLException {
        Connection connection = null;
        SchoolInfo schoolInfo = null;
        ArrayList<String> similarSchools = new ArrayList<String>();
        try {
          connection = db.getConnection();
          // retrieve similar in size:
          PreparedStatement statement = connection
          .prepareStatement("SELECT s.name, SQRT(POWER(c.latitude-gc.latitude,2)+POWER(c.longitude-gc.longitude,2)) as dist FROM School g JOIN Location gl ON g.name=gl.school_name JOIN City gc ON gc.name=gl.city_name AND gc.state=gl.state, School s JOIN Location l ON s.name=l.school_name JOIN City c ON c.name=l.city_name AND c.state=l.state WHERE g.name=? AND g.name!=s.name ORDER BY dist LIMIT 10;");
          statement.setString(1, name);
          ResultSet rs = statement.executeQuery();
          while (rs.next()) {
            String school = rs.getString(1);
            similarSchools.add(school);
            }
          rs.close();
          statement.close();

        } finally {
          if (connection != null) {
            try {
              connection.close();
            } catch (Exception e) {
            }
          }
        }
        return similarSchools;
    }
}
//     public ArrayList<String> getAllNames(String table) throws SQLException {
//         assert table.equals("drinker")
//             || table.equals("beer")
//             || table.equals("bar");
//         Connection connection = null;
//         ArrayList<String> names = new ArrayList<String>();
//         try {
//             connection = db.getConnection();
//             Statement statement = connection.createStatement();
//             ResultSet rs = statement
//                 .executeQuery("SELECT name FROM " + table + " ORDER BY name");
//             while (rs.next()) {
//                 String name = rs.getString(1);
//                 names.add(name);
//             }
//             rs.close();
//             statement.close();
//         } finally {
//             if (connection != null) {
//                 try {
//                     connection.close();
//                 } catch (Exception e) {
//                 }
//             }
//         }
//         return names;
//     }
//
//     public ArrayList<String> getAllDrinkerNames() throws SQLException {
//         return getAllNames("drinker");
//     }
//
//     public ArrayList<String> getAllBeerNames() throws SQLException {
//         return getAllNames("beer");
//     }
//
//     public ArrayList<String> getAllBarNames() throws SQLException {
//         return getAllNames("bar");
//     }
//
//     public DrinkerInfo getDrinkerInfo(String name) throws SQLException {
//         Connection connection = null;
//         DrinkerInfo drinkerInfo = null;
//         try {
//             connection = db.getConnection();
//             // retrieve basic info:
//             PreparedStatement statement = connection
//                 .prepareStatement("SELECT address FROM drinker WHERE name = ?");
//             statement.setString(1, name);
//             ResultSet rs = statement.executeQuery();
//             if (! rs.next()) {
//                 return null;
//             }
//             String address = rs.getString(1);
//             rs.close();
//             statement.close();
//             // retrieve beers liked:
//             statement = connection
//                 .prepareStatement("SELECT beer FROM Likes WHERE drinker =?");
//             statement.setString(1, name);
//             rs = statement.executeQuery();
//             ArrayList<String> beers = new ArrayList<String>();
//             while (rs.next()) {
//                 String beer = rs.getString(1);
//                 beers.add(beer);
//             }
//             rs.close();
//             statement.close();
//             // retrieve bars frequented:
//             statement = connection
//                 .prepareStatement("SELECT bar, times_a_week" +
//                                   " FROM Frequents" +
//                                   " WHERE drinker = ?");
//             statement.setString(1, name);
//             rs = statement.executeQuery();
//             ArrayList<String> bars = new ArrayList<String>();
//             ArrayList<Integer> times = new ArrayList<Integer>();
//             while (rs.next()) {
//                 String bar = rs.getString(1);
//                 bars.add(bar);
//                 int times_a_week = rs.getInt(2);
//                 times.add(times_a_week);
//             }
//             rs.close();
//             statement.close();
//             drinkerInfo = new DrinkerInfo(name, address, beers, bars, times);
//         } finally {
//             if (connection != null) {
//                 try {
//                     connection.close();
//                 } catch (Exception e) {
//                 }
//             }
//         }
//         return drinkerInfo;
//     }
//
//     public boolean updateDrinkerInfo(DrinkerInfo drinkerInfo)
//         throws SQLException {
//         Connection connection = null;
//         boolean oldAutoCommitState = true;
//         boolean success = false;
//         try {
//             connection = db.getConnection();
//             oldAutoCommitState = connection.getAutoCommit();
//             connection.setAutoCommit(false);
//             // update basic info:
//             PreparedStatement statement = connection
//                 .prepareStatement("UPDATE drinker SET address = ? WHERE name = ?");
//             statement.setString(1, drinkerInfo.address);
//             statement.setString(2, drinkerInfo.name);
//             success = (statement.executeUpdate() == 1);
//             statement.close();
//             if (! success) {
//                 connection.rollback();
//                 return false;
//             }
//             // delete old beers liked:
//             statement = connection
//                 .prepareStatement("DELETE FROM Likes WHERE drinker = ?");
//             statement.setString(1, drinkerInfo.name);
//             statement.executeUpdate();
//             statement.close();
//             // add new beers liked:
//             statement = connection
//                 .prepareStatement("INSERT INTO Likes VALUES(?, ?)");
//             for (String beer: drinkerInfo.beersLiked) {
//                 statement.setString(1, drinkerInfo.name);
//                 statement.setString(2, beer);
//                 statement.executeUpdate();
//             }
//             statement.close();
//             // delete old bars frequented:
//             statement = connection
//                 .prepareStatement("DELETE FROM Frequents WHERE drinker = ?");
//             statement.setString(1, drinkerInfo.name);
//             statement.executeUpdate();
//             statement.close();
//             // add new bars frequented:
//             statement = connection
//                 .prepareStatement("INSERT INTO Frequents VALUES(?, ?, ?)");
//             for (int i=0; i<drinkerInfo.barsFrequented.size(); i++) {
//                 statement.setString(1, drinkerInfo.name);
//                 statement.setString(2, drinkerInfo.barsFrequented.get(i));
//                 statement.setInt(3, drinkerInfo.timesFrequented.get(i));
//                 statement.executeUpdate();
//             }
//             statement.close();
//             connection.commit();
//         } finally {
//             if (connection != null) {
//                 try {
//                     connection.setAutoCommit(oldAutoCommitState);
//                     connection.close();
//                 } catch (Exception e) {
//                 }
//             }
//         }
//         return success;
//     }
//
