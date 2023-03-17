-- USE `business`;

-- Revisar employee
SELECT * FROM employee;

-- ALIAS - ayuda a cambiarle los nombres temporalmente
SELECT last_name AS 'Apellido' FROM employee;

-- ALIAS se puede mezclar cuantas se necesiten
SELECT 
	employee_id AS 'ID',
    first_name AS 'Nombre',
    last_name AS 'Apellido',
    department AS 'Departamento'
FROM employee;

-- Filtrar por nombre
-- Buscar a Monika
SELECT * FROM employee
WHERE first_name = 'Monika';

-- FILTRAR doble
SELECT * FROM employee
WHERE salary = 500000 AND first_name = 'Vivek';

-- Filtrar por NOT
SELECT * FROM employee
WHERE NOT first_name = 'Barrack';

-- Filtrar por doble negacion
SELECT * FROM employee
WHERE NOT first_name = 'Santiago' AND NOT first_name = 'Ian';

-- Ordenamiento
-- ORDER BY
-- Default es orden descendiente
SELECT * FROM employee
ORDER BY department DESC;

SELECT * FROM employee
ORDER BY department ASC, last_name DESC;

-- GROUP BY - agrupar en una misma fila
-- no se puede agrupar con datos que son iguales
-- Agrupa complementando con operaciones matemáticas
SELECT * FROM employee
GROUP BY salary;