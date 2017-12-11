\COPY School(name,size,tuition,rank) FROM 'data/school.csv' WITH DELIMITER ',' NULL '' CSV
\COPY City(name,state,latitude,longitude,population,medianResidentAge,HSDegree,medianIncome,belowPovertyLine,foreignBorn,crimeIndex) FROM 'data/cities.csv' WITH DELIMITER ',' NULL '' CSV
\COPY Location(school_name,city_name,state) FROM 'data/location.csv' WITH DELIMITER ',' NULL '' CSV
\COPY Degree(name,start_salary,tenyear_salary) FROM 'data/degrees.csv' WITH DELIMITER ',' NULL '' CSV
\COPY Offering(school_name,degree_name) FROM 'data/offering.csv' WITH DELIMITER ',' NULL '' CSV
