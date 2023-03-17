SELECT * FROM countries;
SELECT * FROM courses;
SELECT * FROM courses_has_students;
SELECT * FROM idtypes;
SELECT * FROM modules;
SELECT * FROM students;

-- primera conexión
-- primero obtenemos tabla students
SELECT 
	t4.name AS 'Modulo',
    -- hay que agrupar, conar estudiantes independiente
    count(t1.idStudent) AS 'Numero de estudiantes'
FROM students
-- vinculamos tabla 2 courses has students
JOIN courses_has_students t2
-- EN idStudent. Junta tabla 1 con 2
ON t1.id_Student = t2.students_id_student
-- segunda conexion
JOIN courses t3
ON t2.course_code = t3.code
-- INNER JOIN para la tabla de modulos
JOIN modules t4
-- Juntamos tabla 3 con 4
ON t3.module_code = t4.code
-- segun al modelo, esto se debe a la conexion con cursos
-- agrupar la informacion
GROUP BY t4.code
ORDER BY count(t1.idStudent);

-- EJERCICIO 4
SELECT 
    employee., bonus.
FROM employee
LEFT OUTER JOIN bonus
ON employee.employee_id = bonus.employee_id_fk
WHERE bonus. employee_id_fk IS NULL;
