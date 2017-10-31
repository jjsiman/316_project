CREATE TABLE School
(name VARCHAR(256) NOT NULL PRIMARY KEY,
 size INTEGER NOT NULL,
 rank INTEGER NOT NULL,
 tuition INTEGER NOT NULL
);

CREATE TABLE University
(name VARCHAR(256) NOT NULL REFERENCES School(name)
);

CREATE TABLE College
(name VARCHAR(256) NOT NULL REFERENCES School(name),
 highest_degree VARCHAR(256) NOT NULL
);

CREATE TABLE City
(name VARCHAR(256) NOT NULL,
 state VARCHAR(256) NOT NULL, 
population INTEGER NOT NULL, 
cost INTEGER NOT NULL, 
crime INTEGER NOT NULL,
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

INSERT INTO School VALUES
	('Duke University', 6501, 1, 63999), 
	('Appalachian State University', 16126, 2,19359), 
	('Davidson College', 1779, 3, 60921), 
	('East Carolina University', 21697, 4, 21040), 
	('Elon University', 5903, 5, 45186), 
	('High Point University', 4362, 6, 46710),
	('University of North Carolina at Chapel Hill', 17951, 7, 23940),
	('University of North Carolina Wilmington', 12971, 8, 21050),
	('Wake Forest University', 4866, 9, 62502),
	('University of North Carolina at Greensboro', 15158, 10, 18357),
	('Queens University of Charlotte', 1551, 11, 46333);

INSERT INTO University VALUES
	('Duke University'),
	('Appalachian State University'),
	('East Carolina University'),
	('Elon University'),
	('High Point University'),
	('University of North Carolina at Chapel Hill'),
	('University of North Carolina Wilmington'),
	('Wake Forest University'),
	('University of North Carolina at Greensboro'),
	('Queens University of Charlotte');

INSERT INTO College VALUES
	('Davidson College', 'Bachelors');

INSERT INTO Location VALUES
	('Duke University',	'Durham', 'NC'),
	('Appalachian State University', 'Boone', 'NC'),
	('Davidson College', 'Davidson', 'NC'),
	('East Carolina University', 'Greenville', 'NC'),
	('Elon University',	'Elon', 'NC'),
	('High Point University', 'High Point', 'NC'),
	('University of North Carolina at Chapel Hill',	'Chapel Hill', 'NC'),
	('University of North Carolina Wilmington',	'Wilmington', 'NC'),
	('Wake Forest University',	'Winston-Salem', 'NC'),
	('University of North Carolina at Greensboro',	'Greensboro', 'NC'),
	('Queens University of Charlotte', 'Charlotte', 'NC');

INSERT INTO City VALUES
	('Durham', 'NC', 228330, 0, 0),
	('Boone', 'NC', 17122, 0, 0),
	('Davidson', 'NC', 10944, 0, 0),
	('Greenville', 'NC', 84554, 0, 0),
	('Elon', 'NC', 9419, 0, 0),
	('High Point', 'NC', 104371, 0, 0),
	('Chapel HIll',	'NC', 57233, 0, 0),
	('Wilmington',	'NC', 106476, 0, 0),
	('Winston-Salem', 'NC',	229617, 0, 0),
	('Greensboro', 'NC', 269666, 0, 0),
	('Charlotte', 'NC', 731424, 0, 0);


INSERT INTO Program VALUES
    ('Chemical Engineering', 'Engineering', 65000),
    ('English', 'Humanities and Liberal Arts', 32000),
    ('Finance', 'Business', 47000),
    ('Nursing', 'Health', 48000),
    ('Mathematics', 'Computers and Mathematics', 45000);


INSERT INTO Offering VALUES
    ('Duke University', 'Chemical Engineering'),
    ('Duke University', 'English'),
    ('Duke University', 'Mathematics'),
    ('Wake Forest University', 'Mathematics'),
    ('Wake Forest University', 'Nursing'),
    ('Queens University of Charlotte', 'English');
    

