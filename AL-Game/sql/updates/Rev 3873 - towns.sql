DELETE FROM `towns`;
ALTER TABLE `towns` ADD COLUMN `race` ENUM('ELYOS','ASMODIANS') NOT NULL AFTER `points`;
ALTER TABLE `towns` ADD COLUMN `level_up_date` TIMESTAMP NOT NULL DEFAULT '1970-01-01 07:00:01' AFTER `race`;