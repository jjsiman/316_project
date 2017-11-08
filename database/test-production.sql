-- test_production.sql

-- School info if somebody searches for 'Duke University'
SELECT size FROM School WHERE name = 'Duke University';
SELECT rank FROM School WHERE name = 'Duke University';
SELECT tuition FROM School WHERE name = 'Duke University';
SELECT city_name FROM location JOIN school s ON s.name=school_name WHERE s.name = 'Duke University';
SELECT state FROM location JOIN school s ON s.name=school_name WHERE s.name = 'Duke University';

-- Similar schools

-- Similar size
SELECT s2.name, ABS(s1.size-s2.size) AS sizeDif FROM school s1 JOIN school s2 ON s1.name <> s2.name WHERE s1.name = 'Duke University' AND ABS(s1.size-s2.size) < 2000 ORDER BY sizeDif LIMIT 10;

-- Similar tuition
SELECT s2.name, ABS(s1.tuition-s2.tuition) AS tuitionDif FROM school s1 JOIN school s2 ON s1.name <> s2.name WHERE s1.name = 'Duke University' AND ABS(s1.tuition-s2.tuition) < 5000 ORDER BY tuitionDif LIMIT 10;

-- Schools close by
SELECT s.name, SQRT(POWER(c.latitude-gc.latitude,2)+POWER(c.longitude-gc.longitude,2)) as dist FROM School g JOIN Location gl ON g.name=gl.school_name JOIN City gc ON gc.name=gl.city_name AND gc.state=gl.state, School s JOIN Location l ON s.name=l.school_name JOIN City c ON c.name=l.city_name AND c.state=l.state WHERE g.name='Duke University' AND g.name!=s.name ORDER BY dist LIMIT 10;
