CREATE TABLE School
(name VARCHAR(256) NOT NULL PRIMARY KEY,
 size INTEGER NOT NULL,
 tuition INTEGER NOT NULL,
 rank INTEGER NOT NULL
);

CREATE TABLE City
(name VARCHAR(256) NOT NULL,
 state VARCHAR(256) NOT NULL,
 latitude FLOAT NOT NULL,
 longitude FLOAT NOT NULL,
 population INTEGER NOT NULL,
 medianResidentAge FLOAT NOT NULL,
 HSDegree FLOAT NOT NULL,
 medianIncome INTEGER NOT NULL,
 belowPovertyLine FLOAT NOT NULL,
 foreignBorn FLOAT NOT NULL,
 crimeIndex FLOAT NOT NULL,
 PRIMARY KEY (name, state)
);

CREATE TABLE Location
(school_name VARCHAR(256) NOT NULL REFERENCES School(name),
 city_name VARCHAR(256) NOT NULL,
 state VARCHAR(256) NOT NULL
);

CREATE TABLE Degree
(name VARCHAR(256) NOT NULL PRIMARY KEY,
 start_salary INTEGER NOT NULL,
 tenyear_salary INTEGER NOT NULL
);

CREATE TABLE Offering
(school_name VARCHAR(256) NOT NULL REFERENCES School(name),
 degree_name VARCHAR(256) NOT NULL REFERENCES Degree(name)
);
