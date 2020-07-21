CREATE TABLE `onlineshopping`.`category` ( 
`Id` INT NOT NULL AUTO_INCREMENT , 
`Name` VARCHAR(50) NOT NULL , 
`description` VARCHAR(255) NOT NULL , 
`image_url` VARCHAR(255) NOT NULL , 
`is_active` BOOLEAN NOT NULL , 
PRIMARY KEY (`Id`)) 