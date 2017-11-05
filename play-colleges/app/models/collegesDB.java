package models;

import play.db.*;
import javax.inject.*;
import java.sql.*;
import javax.sql.*;
import java.util.ArrayList;

@Singleton
public class collegesDB {

    public static class SchoolInfo {
        public String name;

        public int size;
        public int rank;
        public int tuition;
        public SchoolInfo() {
        }
        public SchoolInfo(String name,int size,int rank,int tuition) {
            this.name = name;
            this.size = size;
            this.rank = rank;
            this.tuition = tuition;
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
        schoolInfo = new SchoolInfo(name, size, rank, tuition);
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

    public ArrayList<String> getSimilarSchoolInfo(String name) throws SQLException {
        Connection connection = null;
        SchoolInfo schoolInfo = null;
        ArrayList<String> similarSchools = new ArrayList<String>();
        try {
          connection = db.getConnection();
          // retrieve similar in size:
          PreparedStatement statement = connection
          .prepareStatement("SELECT s2.name FROM school s1 JOIN school s2 ON s1.name <> s2.name WHERE s1.name = ? AND ABS(s1.size - s2.size) < 2000");
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
