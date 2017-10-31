--Sample Queries


-- first test to make sure it prints right
SELECT * FROM school WHERE (name='Duke University');

--Return similar sized schools 
SELECT s2.* FROM school s1 
JOIN school s2 ON s1.name <> s2.name 
WHERE s1.name = 'Duke University' AND ABS(s1.size - s2.size) < 2000;

--Return similar costing schools
SELECT s2.* FROM school s1 
JOIN school s2 ON s1.name <> s2.name 
WHERE s1.name = 'Duke University' AND ABS(s1.tuition - s2.tuition) < 5000;

--Return schools in areas with similar populations
SELECT fullTwo.* FROM (school s1 JOIN (location JOIN city 
	ON location.city_name = city.name 
	AND location.state = city.state) 
ON s1.name = location.school_name) AS fullOne 
JOIN
(school s2 JOIN (location JOIN city 
	ON location.city_name = city.name 
	AND location.state = city.state) 
ON s2.name = location.school_name) AS fullTwo
ON fullOne.school_name <> fullTwo.school_name 
WHERE fullOne.school_name = 'Duke University' 
AND ABS(fullOne.population - fullTwo.population) < fullOne.population*0.25;

--Return schools offering majors with median salary above $45,000
SELECT o.school_name, p.name
FROM Program p, Offering o
WHERE p.name = o.program_name
AND p.expected_salary > 45000;

--Update statement to change table data
UPDATE Program SET expected_salary=50000 WHERE expected_salary=45000;

--Proof of update
SELECT p.name
FROM Program p
WHERE expected_salary=50000;
