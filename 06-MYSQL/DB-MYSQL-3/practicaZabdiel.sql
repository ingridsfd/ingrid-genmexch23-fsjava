USE business;

-- DESC
SELECT * FROM employee
ORDER BY department DESC;
-- Doble Order by
-- SELECT * FROM employee
-- ORDER BY department ASC, last_name DESC;
-- GROUP´BY
-- SELECT * FROM employee
-- GROUP BY salary;
-- IN 
-- SELECT * FROM employee
-- WHERE employee_id IN(1, 3, 7, 8, 5, 9);

-- BETWEEN Rangos, calificaciones, promedios
-- SELECT * FROM employee
-- WHERE salary BETWEEN 200000 AND 500000;

-- Lo contrario BETWEEN NOT
-- SELECT * FROM employee
-- WHERE salary NOT BETWEEN 200000 AND 500000;

-- LIMIT para data muy grande, obtener primeros 3 datos
-- SELECT * FROM employee
-- LIMIT 5;

-- LIMIT + OFFSET para rangos particulares, límite de fechas
-- SELECT * FROM employee
-- LIMIT 3 OFFSET 3;

-- LIKE es como expresiones regulares
-- SELECT * FROM employee
-- WHERE last_name LIKE 'B%';

-- LIKE es la version alreves te busca hacia la ultima letra de la palabra
-- SELECT * FROM employee
-- WHERE last_name LIKE '%B';

-- LIKE ++ para especificar la fecha -- '%02%'
-- SELECT * FROM employee
-- WHERE join_date LIKE '2014-02%';

UPDATE employee
	SET salary = 2869
WHERE employee_id = 1;

UPDATE employee
	SET salary = 5000
WHERE employee_id = 2;

UPDATE employee
	SET salary = 4536
WHERE employee_id = 3;

-- Actualizar datos
UPDATE employee
	SET salary = 1578
WHERE employee_id = 4;

UPDATE employee
	SET salary = 8788
WHERE employee_id = 5;

UPDATE employee
	SET salary = 2500
WHERE employee_id = 6;

UPDATE employee
	SET salary = 9856
WHERE employee_id = 7;

UPDATE employee
	SET department = 'HR'
WHERE employee_id = 7;

UPDATE employee
	SET department = 'Account'
WHERE employee_id = 2;

INSERT INTO employee (employee_id, first_name, last_name, salary, join_date, department)
VALUES (9, 'David', 'Guzman', 50, '2014-03-17', 'HR');

SELECT * FROM employee;

-- MIN
SELECT MIN(salary) FROM employee;
SELECT MIN(last_name) FROM employee;

-- MAX
SELECT MAX(salary) FROM employee;

-- AVG
SELECT AVG(salary) AS promedio FROM employee;
SELECT AVG(last_name) FROM employee;

-- SUM
SELECT SUM(employee_id) FROM employee;
SELECT SUM(salary), AVG(salary) FROM employee;

-- COUNT 
SELECT COUNT(employee_id) FROM employee;
SELECT COUNT(salary) FROM employee;
SELECT COUNT(DISTINCT(salary)) FROM employee;
