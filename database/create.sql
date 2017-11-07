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
 population INTEGER,
 medianResidentAge FLOAT,
 HSDegree FLOAT,
 medianIncome INTEGER,
 belowPovertyLine FLOAT,
 foreignBorn FLOAT,
 crimeIndex FLOAT,
 PRIMARY KEY (name, state)
);

CREATE TABLE Location
(school_name VARCHAR(256) NOT NULL REFERENCES School(name),
 city_name VARCHAR(256) NOT NULL,
 state VARCHAR(256) NOT NULL
);

CREATE TABLE Program
(name VARCHAR(256) NOT NULL PRIMARY KEY,
 category VARCHAR(256) NOT NULL UNIQUE,
 expected_salary INTEGER NOT NULL
);

CREATE TABLE Offering
(school_name VARCHAR(256) NOT NULL REFERENCES School(name),
 program_name VARCHAR(256) NOT NULL REFERENCES Program(name)
);
