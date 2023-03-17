SELECT * FROM countries;
SELECT * FROM courses;
SELECT * FROM courses_has_students;
SELECT * FROM idtypes;
SELECT * FROM modules;
SELECT * FROM students;

-- Encontrar a que pais pertenecen
-- SELECT para traer
-- tabla A : students
-- tabla B: countries + nombre de objeto "name"
-- tabla B: countries + nombre de objeto "code"
-- DE la tabla A students
-- INNER JOIN + countries, va a tomar tabla B
-- ON cuáles son las llaves primarias y foráneas para la unión
-- SELECT 
	-- students.*,
    -- students.idStudent AS 'ID',
    -- students.name AS 'Nombre',
    -- students.last_name AS 'Apellido',
    -- countries.name AS 'País de origen', 
    -- countries.code AS 'Código del país'
-- FROM students
-- INNER JOIN countries
-- ON 
-- students.nationality = countries.idCountries;

-- Encontramos que tipo de ID tiene la raza
-- SELECT
-- students.idStudent AS 'ID',
-- students.name AS 'Nombre',
-- students.last_name AS 'Apellido',
-- idtypes.name AS 'Tipo de ID de registro'
-- FROM students
-- INNER JOIN idtypes
-- ON students.idType_id = idtypes.id_idTypes;

-- Abreviaciones
-- SELECT 
	-- students.name, 
    -- countries.name,
    -- countries.code
-- FROM students t1
-- INNER JOIN countries t2
-- ON t1.nationality = t2.idCountries;

-- Encontrar estudiantes que esten registrados en un curso
-- Colocar nombre, id, apellido, curso al que estan registrados
-- SELECT
	-- t1.idStudent AS 'ID',
    -- t1.name AS 'Nombre',
    -- t1.last_name AS 'Apellido',
    -- t2.course_code AS 'Curso actual'
-- FROM students t1
-- INNER JOIN courses_has_students t2
-- ON t1.idStudent = t2.students_id_student;

-- Unir tres tablas
-- De tabla 2 a 1 
-- De tabla 3 a 2
-- SELECT
	-- t1.name AS 'Nombre',
    -- t1.last_name AS 'Apellido',
    -- t2.course_code AS 'Código de curso',
    -- t3.name AS 'Curso',
    -- t3.credits
-- FROM students t1
-- INNER JOIN courses_has_students t2
-- ON t1.idStudent = t2.students_id_student
-- INNER JOIN courses t3
-- ON t2.course_code = t3.code;

-- SELECT 
-- t1.course_code AS 'Codigo de curso',
-- t2.code AS 'Codigo de curso',
-- t2.name AS 'Curso'
-- FROM courses_has_students t1
-- INNER JOIN courses t2
-- ON t1.course_code = t2.code
-- GROUP BY t2.code;

-- Encontrar estudiantes que sean del pais 125
SELECT * FROM students
WHERE nationality = 125;
-- Contar estudiantes que pertenezcan al curso JAVA-1
SELECT COUNT(*) AS 'Numero de estudiantes' 
FROM courses_has_students 
WHERE course_code = 'JAVA-1';
-- Contar estudiantes por cada modulo -- GROUP BY & COUNT
SELECT modules.code AS 'Codigo de modulo', COUNT(*) AS 'Numero de estudiantes'
FROM modules
INNER JOIN courses
ON modules.code = courses.module_code
INNER JOIN courses_has_students
ON courses.code = courses_has_students.course_code
GROUP BY modules.code;
-- Encontrar estudiantes SIN curso
SELECT *
FROM students e
LEFT JOIN courses_has_students c 
ON e.idStudent = c.students_id_student
WHERE c.course_code IS NULL;
