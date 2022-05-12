--Creacion de la base de datos CarSystems--
CREATE DATABASE IF NOT EXISTS carsystems DEFAULT CHARACTER SET utf8;

--Usamos la base de datos creada para crear las tablas--
USE carsystems;

--Creacion de las tablas de la BD--

CREATE TABLE IF NOT EXISTS usuario(
    tipo_id VARCHAR (30) NOT NULL,
    id_usuario BIGINT NOT NULL,
    primer_apellido VARCHAR (30) NOT NULL,
    segundo_apellido VARCHAR (30) NULL,
    nombre_usuario VARCHAR (20) NOT NULL,
    correo VARCHAR (50) NOT NULL UNIQUE,
    departamento VARCHAR (50) NOT NULL,
    municipio VARCHAR (50) NOT NULL,
    direccion VARCHAR (50) NOT NULL,
    telefono VARCHAR (10)  NOT NULL,
    rol VARCHAR (30) NOT NULL,
    contrasena VARCHAR (20) NOT NULL,
    PRIMARY KEY (tipo_id, id_usuario)
);

CREATE TABLE IF NOT EXISTS departamento(
    id_departamento BIGINT NOT NULL AUTO_INCREMENT,
    nombre_departamento VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_departamento)
);

CREATE TABLE IF NOT EXISTS municipio(
    id_municipio BIGINT NOT NULL AUTO_INCREMENT,
    id_departamento BIGINT NOT NULL,
    nombre_municipio VARCHAR (50) NOT NULL,
    PRIMARY KEY (id_municipio)
);

CREATE TABLE IF NOT EXISTS inicio_sesion (
    id_login BIGINT NOT NULL AUTO_INCREMENT,
    email_usuario VARCHAR (50) NOT NULL,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estado_login BOOLEAN,
    PRIMARY KEY (id_login)
);

CREATE TABLE IF NOT EXISTS marca (
    id_marca BIGINT NOT NULL AUTO_INCREMENT,
    nombre_marca VARCHAR (50) NOT NULL,
    PRIMARY KEY (id_marca)
);

CREATE TABLE IF NOT EXISTS linea (
    id_linea BIGINT NOT NULL AUTO_INCREMENT,
    id_marca BIGINT NOT NULL,
    nombre_linea VARCHAR (50) NOT NULL,
    PRIMARY KEY (id_linea)
);

CREATE TABLE IF NOT EXISTS tipo_maquinaria(
    id_tipo_maquinaria BIGINT NOT NULL,
    nombre_tipo_maquinaria VARCHAR (30) NOT NULL,
    PRIMARY KEY (id_tipo_maquinaria)
);

CREATE TABLE IF NOT EXISTS vehiculo (
    id_vehiculo VARCHAR (30) NOT NULL,
    tipo_id_usuario VARCHAR (30) NOT NULL,
    id_usuario BIGINT NOT NULL,
    tipo_servicio VARCHAR (30) NOT NULL,
    tipo_vehiculo VARCHAR(30) NOT NULL, 
    marca VARCHAR(50) NOT NULL,
    linea VARCHAR(50) NOT NULL,
    color VARCHAR (20) NOT NULL,
    modelo INT NULL,
    cupo_persona SMALLINT DEFAULT 1,
    utilitario BOOLEAN NULL DEFAULT 0,
    blindado BOOLEAN NULL DEFAULT 0,
    precio REAL NOT NULL DEFAULT 0,
    imagen LONGBLOB NULL,
    descripcion TEXT NULL,
    estado_judicial LONGBLOB NULL COMMENT 'Archivo PDF',
    peso REAL NULL,
    alto REAL NULL,
    ancho REAL NULL,
    largo REAL NULL,
    tipo_maquinaria VARCHAR (50) NULL,
    PRIMARY KEY (id_vehiculo)
);

CREATE TABLE IF NOT EXISTS inspeccion (
    id_inspeccion BIGINT NOT NULL AUTO_INCREMENT,
    id_vehiculo VARCHAR (30) NOT NULL,
    fecha_inspeccion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    fecha_ven_soat DATE NOT NULL,
    fecha_man_preventivo DATE NULL,
    fecha_ult_cambio_aceite DATE NOT NULL,
    km_actual INT NOT NULL DEFAULT 0,
    liquido_refrigerante BOOLEAN NOT NULL,
    liquido_freno BOOLEAN NOT NULL,
    aceite_motor BOOLEAN NOT NULL,
    liquido_hidraulico BOOLEAN NOT NULL,
    agua_limpiavidrios BOOLEAN NOT NULL,
    acelerador BOOLEAN NOT NULL,
    clutsh BOOLEAN NOT NULL,
    freno BOOLEAN NOT NULL,
    luces BOOLEAN NOT NULL,
    direccionales BOOLEAN NOT NULL,
    estacionarias BOOLEAN NOT NULL,
    stops BOOLEAN NOT NULL,
    testigo_tablero BOOLEAN NOT NULL,
    luz_reversa BOOLEAN NOT NULL,
    luces_internas BOOLEAN NOT NULL,
    equipo_carretera BOOLEAN NOT NULL,
    extintor BOOLEAN NOT NULL,
    fecha_ven_extintor BOOLEAN NOT NULL,
    llanta_repuesto BOOLEAN NOT NULL,
    cruceta BOOLEAN NOT NULL,
    senales_reflectivas BOOLEAN NOT NULL,
    caja_herramientas BOOLEAN NOT NULL,
    linterna BOOLEAN NOT NULL,
    gato BOOLEAN NOT NULL,
    botiquin BOOLEAN NOT NULL,
    llantas BOOLEAN NOT NULL,
    bateria BOOLEAN NOT NULL,
    rines BOOLEAN NOT NULL,
    cinturon_seguridad BOOLEAN NOT NULL,
    pito_reversa BOOLEAN NOT NULL,
    pito BOOLEAN NOT NULL,
    freno_emergencia BOOLEAN NOT NULL,
    espejos BOOLEAN NOT NULL,
    carcasa_luces BOOLEAN NOT NULL,
    limpia_parabrisa BOOLEAN NOT NULL,
    tapizado BOOLEAN NOT NULL,
    panoramico BOOLEAN NOT NULL,
    observacion VARCHAR (255) NULL,
    PRIMARY KEY (id_inspeccion)
);

--Creacion de las llaves foraneas para las tablas--

ALTER TABLE linea
    ADD CONSTRAINT fk_marca_linea
        FOREIGN KEY (id_marca)
        REFERENCES marca (id_marca)
        ON UPDATE CASCADE;        

ALTER TABLE vehiculo
    ADD CONSTRAINT fk_usuario_vehiculo
        FOREIGN KEY (tipo_id_usuario, id_usuario)
        REFERENCES usuario (tipo_id, id_usuario)
        ON UPDATE CASCADE;
    
ALTER TABLE inspeccion
    ADD CONSTRAINT fk_vehiculo_inspeccion
        FOREIGN KEY (id_vehiculo)
        REFERENCES vehiculo (id_vehiculo)
        ON UPDATE CASCADE;

ALTER TABLE municipio
    ADD CONSTRAINT fk_departamento_municipio
        FOREIGN KEY (id_departamento)
        REFERENCES departamento (id_departamento)
        ON UPDATE CASCADE;