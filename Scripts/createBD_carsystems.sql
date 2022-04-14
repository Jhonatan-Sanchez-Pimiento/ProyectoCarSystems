--Creacion de la base de datos CarSystems--
CREATE DATABASE IF NOT EXISTS carsystems;

--Usamos la base de datos creada para crear las tablas--
USE carsystems;

--Creacion de las tablas de la BD--
CREATE TABLE IF NOT EXISTS tipo_servicio(
    id_tipo_servicio BIGINT NOT NULL AUTO_INCREMENT,
    nombre_servicio VARCHAR (50) NOT NULL,
    PRIMARY KEY (id_tipo_servicio)
);

CREATE TABLE IF NOT EXISTS rol (
    id_rol BIGINT NOT NULL AUTO_INCREMENT,
    nombre_rol VARCHAR(30),
    PRIMARY KEY (id_rol)
);

CREATE TABLE IF NOT EXISTS usuario(
    tipo_id VARCHAR (3) NOT NULL COMMENT 'CC: CEDULA CIUDADANIA, CE: CEDULA EXTRANJERIA, PAS: PASAPORTE',
    id_usuario BIGINT NOT NULL,
    nombre_usuario VARCHAR (20) NOT NULL,
    apellido_usuario VARCHAR (30) NOT NULL,
    direccion VARCHAR (50) NULL,
    telefono VARCHAR (10) NULL,
    email_usuario VARCHAR (50) NOT NULL UNIQUE,
    contrasena VARCHAR (20) NOT NULL,
    id_rol BIGINT NOT NULL,
    PRIMARY KEY (tipo_id, id_usuario)
);

CREATE TABLE IF NOT EXISTS inicio_sesion (
    id_login BIGINT NOT NULL AUTO_INCREMENT,
    email_usuario VARCHAR (50) NOT NULL,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estado_login BOOLEAN,
    PRIMARY KEY (id_login)
);

CREATE TABLE IF NOT EXISTS chat_usuario (
    id_chat BIGINT NOT NULL AUTO_INCREMENT,
    email_usuario_uno VARCHAR (50) NOT NULL,
    email_usuario_dos VARCHAR (50) NOT NULL,
    PRIMARY KEY (id_chat)
);

CREATE TABLE IF NOT EXISTS mensaje_chat (
    id_mensaje BIGINT NOT NULL AUTO_INCREMENT,
    id_chat BIGINT NOT NULL,
    email_usuario_receptor VARCHAR (50) NOT NULL,
    email_usuario_lector VARCHAR (50) NOT NULL,
    mensaje VARCHAR (255) NULL,
    PRIMARY KEY (id_mensaje)
);

CREATE TABLE IF NOT EXISTS marca (
    id_marca BIGINT NOT NULL AUTO_INCREMENT,
    nombre_marca VARCHAR (20) NOT NULL,
    PRIMARY KEY (id_marca)
);

CREATE TABLE IF NOT EXISTS linea (
    id_linea BIGINT NOT NULL AUTO_INCREMENT,
    id_marca BIGINT NOT NULL,
    nombre_linea VARCHAR (30) NOT NULL,
    PRIMARY KEY (id_linea)
);

CREATE TABLE IF NOT EXISTS tipo_maquinaria(
    id_tipo_maquinaria BIGINT NOT NULL,
    nombre_tipo_maquinaria VARCHAR (30) NOT NULL,
    PRIMARY KEY (id_tipo_maquinaria)
);

CREATE TABLE IF NOT EXISTS vehiculo (
    id_vehiculo VARCHAR (20) NOT NULL,
    tipo_id_usuario VARCHAR (3) NOT NULL,
    id_usuario BIGINT NOT NULL,
    id_tipo_servicio BIGINT NOT NULL,
    tipo_vehiculo ENUM ('AUTOMOVIL','CAMIONETA','MAQUINARIA PESADA') NULL, 
    id_marca BIGINT NOT NULL,
    id_linea BIGINT NOT NULL,
    color VARCHAR (15) NOT NULL,
    modelo YEAR NOT NULL,
    cupo_persona SMALLINT DEFAULT 0,
    utiliario BOOLEAN NULL DEFAULT 0,
    blindado BOOLEAN NULL DEFAULT 0,
    precio REAL NOT NULL DEFAULT 0,
    imagen LONGBLOB NULL,
    descripcion TEXT NULL,
    estado_judicial VARCHAR (20) NULL COMMENT 'EMBARGADO, ACCIDENTADO, ROBADO',
    peso REAL NULL,
    alto REAL NULL,
    ancho REAL NULL,
    largo REAL NULL,
    id_tipo_maquinaria BIGINT NULL,
    PRIMARY KEY (id_vehiculo)
);

--Creacion de las llaves foraneas para las tablas--
ALTER TABLE usuario
    ADD CONSTRAINT fk_rol_usuario
        FOREIGN KEY (id_rol)
        REFERENCES rol (id_rol)
        ON UPDATE CASCADE;

ALTER TABLE linea
    ADD CONSTRAINT fk_marca_linea
        FOREIGN KEY (id_marca)
        REFERENCES marca (id_marca)
        ON UPDATE CASCADE;        

ALTER TABLE vehiculo
    ADD CONSTRAINT fk_usuario_vehiculo
        FOREIGN KEY (tipo_id_usuario, id_usuario)
        REFERENCES usuario (tipo_id, id_usuario)
        ON UPDATE CASCADE,
    ADD CONSTRAINT fk_tipo_maquinaria_vehiculo
        FOREIGN KEY (id_tipo_maquinaria)
        REFERENCES tipo_maquinaria (id_tipo_maquinaria)
        ON UPDATE CASCADE;