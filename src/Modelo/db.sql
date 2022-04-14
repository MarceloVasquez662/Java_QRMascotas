-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`MASCOTA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`MASCOTA` (
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
  PRIMARY KEY (`idMASCOTA`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`hogares`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`hogares` (
  `idhogares` INT NOT NULL AUTO_INCREMENT,
  `direccion` VARCHAR(45) NOT NULL,
  `gato` BOOLEAN  NOT NULL,
  `perro` BOOLEAN  NOT NULL,
  `conejo` BOOLEAN  NOT NULL,
  `contacto` INT NOT NULL,
  `rutDueno` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idhogares`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
