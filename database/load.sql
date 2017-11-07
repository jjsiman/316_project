\COPY School(name,tuition,size,rank) FROM 'data/school.csv' WITH DELIMITER ',' NULL '' CSV
\COPY City(name,state,latitude,longitude,population,medianResidentAge,HSDegree,medianIncome,belowPovertyLine,foreignBorn,crimeIndex) FROM 'data/city.csv' WITH DELIMITER ',' NULL '' CSV
\COPY Location(school_name,city_name,state) FROM 'data/location.csv' WITH DELIMITER ',' NULL '' CSV
