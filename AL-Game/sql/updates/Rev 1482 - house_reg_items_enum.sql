ALTER TABLE `player_registered_items` CHANGE COLUMN area area enum('NONE','INTERIOR','EXTERIOR','ALL','DECOR') NOT NULL DEFAULT 'NONE';