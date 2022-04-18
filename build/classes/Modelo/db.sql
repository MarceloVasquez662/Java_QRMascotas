
-- -----------------------------------------------------
-- Table `mydb`.`MASCOTA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MASCOTA` (
  `idMASCOTA` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `raza` VARCHAR(45) NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  `fechaNacimiento` DATE NOT NULL,
  `nombreDueno` VARCHAR(45) NOT NULL,
  `rutDueno` VARCHAR(10) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `telefono` INT NOT NULL,
  `perdido` BOOLEAN NOT NULL,
  `ultimaUbicacion` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idMASCOTA`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`hogares`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `HOGARES` (
  `idHOGARES` INT NOT NULL AUTO_INCREMENT,
  `direccion` VARCHAR(45) NOT NULL,
  `gato` BOOLEAN NOT NULL,
  `perro` BOOLEAN NOT NULL,
  `conejo` BOOLEAN NOT NULL,
  `contacto` INT NOT NULL,
  `rutDueno` VARCHAR(10) NOT NULL,
  `nombreDueno` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idhogares`))
ENGINE = InnoDB;
