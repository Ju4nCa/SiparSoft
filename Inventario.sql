-- Database: "Inventario"

-- DROP DATABASE "Inventario";

CREATE DATABASE "Inventario"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Spanish_Colombia.1252'
       LC_CTYPE = 'Spanish_Colombia.1252'
       CONNECTION LIMIT = -1;

CREATE TABLE Empleado (
cedula		int NOT NULL,
nombre		varchar (20),
apellido	varchar (20),
tipo		varchar (10),
celular		int,
correo		varchar (20),
contraseña	varchar (20),
PRIMARY KEY (cedula)
);

CREATE TABLE Cliente (
cedula		int NOT NULL,
nombre		varchar (20),
apellido	varchar (20),
celular		int,
direccion	varchar (20),
PRIMARY KEY (cedula)
);

CREATE TABLE Factura (
nroFactura	int NOT NULL,
fecha		date,
valor		int,
PRIMARY KEY (nroFactura)
);

CREATE TABLE Provedor (
cedula		int NOT NULL,
nombre	varchar (20),
apellido	varchar (20),
telefono	int,
direccion	varchar (10),
PRIMARY KEY (cedula)
);

CREATE TABLE Producto (
codigo		int NOT NULL,
nombre	varchar (20),
tipo		varchar (10),
color		varchar (20),
direccion	varchar (10),
PRIMARY KEY (codigo)
);


CREATE TABLE Entrada (
lote		int,
talla		varchar (20),
cantidad	int,
precioC		int,
fecha		date,
PRIMARY KEY (lote)
);

CREATE TABLE Salida (
id		int,
cantidad	int,
precioV		int,
PRIMARY KEY (id)
);


INSERT INTO Empleado VALUES (12345, 'pablo', 'riascos', 'vendedor', 341321, 'juanpis@gmail.com','holamundo');

SELECT * FROM Empleado;
