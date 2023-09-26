-- Create user table
CREATE TABLE IF NOT EXISTS `user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(30) NOT NULL,
	`password` VARCHAR(255) NOT NULL,
	`salt` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
	
	-- 	Insert data into user
INSERT INTO user (username, password, salt) VALUES ("Charles", "123", "123");
INSERT INTO user (username, password, salt) VALUES ("Zoey", "123", "123");
