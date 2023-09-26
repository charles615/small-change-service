# small-change-service-- Create history list table

CREATE TABLE IF NOT EXISTS `history_list` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `account` VARCHAR(45) NOT NULL,
	`asset` VARCHAR(45) NOT NULL,
  `amount` DOUBLE,
	`type` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
	
-- 	Insert data into history_list

INSERT INTO history_list (account, type, amount, side, description) VALUES ("401K", "cash", 300.0, "sell", "none");
INSERT INTO history_list (account, type, amount, side, description) VALUES ("401K", "stock", 30000, "buy", "none");
INSERT INTO history_list (account, type, amount, side, description) VALUES ("401K", "fund", 30000.0, "sell", "none");
INSERT INTO history_list (account, type, amount, side, description) VALUES ("401K", "cash", 300.0, "sell", "none");
INSERT INTO history_list (account, type, amount, side, description) VALUES ("HSAs", "cash", 400.0, "buy", "none");
INSERT INTO history_list (account, type, amount, side, description) VALUES ("HSAs", "stock", 4000.0, "sell", "none");
INSERT INTO history_list (account, type, amount, side, description) VALUES ("401K", "fund", 40000.0, "sell", "none");