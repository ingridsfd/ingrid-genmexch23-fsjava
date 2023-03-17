-- Selecciona todo de una tabla
SELECT * FROM `users`;

-- Seleccionar solo una columna
SELECT `first_name` FROM `users`;

-- Insertar datos a tabla Pets
INSERT INTO `pets`
(first_name, fav_food, `type`, users_idusers)
VALUES
('Griselo', 'Fresas', 'Conejo', 1),
('Nikki','Caldito con tortillitas','Doggo',2),
('Pepperoni', 'Huesitos de manzanas', 'Doggo',3),
('Pepe', 'Semillas de girasol', 'Cotorro', 3);

-- Seleccionar todo de pets
SELECT * FROM `pets`;

-- Filtrar por FK para identificar a owners 
SELECT * FROM `pets`
WHERE users_idusers = 3;

-- Agregar al menos 1 usuario y 1 mascota por integrante
INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES 
('Ian', 'Galeana', 'Tacos');

INSERT INTO `pets`
(first_name, `type`)
VALUES 
('Ezequiel', 'Gato', 4);

INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Alejandro', 'Hernandez', 'Lasagna');

INSERT INTO `pets`
(first_name, fav_food, `type`, users_idusers)
VALUES
('Niebla', 'Pollo', 'Pug', 4);

INSERT INTO `users` 
(First_name,Last_name,Fav_food)
VALUES 
('Jose Antonio','Haro Gonzalez','Chimichangas');

INSERT INTO `pets`
(First_name,Last_name,Fav_food,`Type`,Users_idUsers)
VALUES
('Zorrillo','Gamboa','Carne','Doggo',4);

INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Daniel', 'Guzman', 'Pizza');

INSERT INTO `pets`
(first_name, las_name, type_pets, Tabla_idTabla)
VALUES 
('Maya', 'Lobita', 'HUSKY', 4);

INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Cesar', 'Reyes', 'Carnita Asada');

INSERT INTO `pets`
(first_name, last_name, fav_food, `type`, users_idusers)
VALUES
('Max', 'Reyes', 'Carne', 'Poodle', 4);
