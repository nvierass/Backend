CREATE DATABASE "BD_Mingeso"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

\c BD_Mingeso


DROP TABLE IF EXISTS producto;


create table producto(
	codigoProducto serial PRIMARY KEY,
	nombre varchar(32) not null,
	fechaVencimiento date,
	categoria varchar(32) not null,
	precio int not null
);

INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto A','2022-01-01','Nacional',1000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto B','2022-02-03','Importado',4000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto C','2022-03-05','Nacional',15000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto D','2022-04-08','Nacional',1500);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto E','2022-05-10','Importado',5000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto F','2022-06-01','Nacional',1000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto G','2022-07-03','Importado',7000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto H','2022-08-04','Nacional',1500);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto I','2022-09-07','Nacional',1200);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto J','2022-01-01','Nacional',1000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto K','2022-02-03','Importado',4000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto L','2022-03-05','Nacional',15000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto M','2022-04-08','Nacional',1500);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto N','2022-05-10','Importado',5000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto O','2022-06-01','Nacional',1000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto P','2022-07-03','Importado',7000);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto Q','2022-08-04','Nacional',1500);
INSERT INTO producto(nombre,fechaVencimiento,categoria,precio) VALUES('Producto R','2022-09-07','Nacional',1200);