
CREATE TABLE `hospitales`.`alta_complejidad` (
  `id_alta_complejidad` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `domicilio` VARCHAR(45) NULL,
  `director` VARCHAR(45) NULL,
  `capacidad` FLOAT NULL,
  `especialidad` VARCHAR(45) NULL,
  `cantidad_camas` INT(11) NULL,
  PRIMARY KEY (`id_alta_complejidad`));
  
  
CREATE TABLE `hospitales`.`atencion_primaria` (
  `id_atencion_primaria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `domicilio` VARCHAR(45) NULL,
  `director` VARCHAR(45) NULL,
  `capacidad` FLOAT NULL,
  `tiene_laboratorio` TINYINT NULL,
  `tiene_radiologia` TINYINT NULL,
  `tiene_vacunatorio` TINYINT NULL,
  PRIMARY KEY (`id_atencion_primaria`));
  
