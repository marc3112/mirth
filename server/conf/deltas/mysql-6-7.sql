DROP TABLE CONFIGURATION;

CREATE TABLE CONFIGURATION
	(CATEGORY VARCHAR(255) NOT NULL,
	NAME VARCHAR(255) NOT NULL,
	VALUE LONGTEXT NOT NULL) ENGINE=InnoDB;
	
DROP TABLE PREFERENCES;

ALTER TABLE SCRIPT ADD COLUMN GROUP_ID VARCHAR(255) NOT NULL;

UPDATE SCRIPT SET GROUP_ID = 'GLOBAL' WHERE ID = 'Deploy' OR ID = 'Shutdown' OR ID = 'Preprocessor' OR ID = 'Postprocessor';

DELETE FROM SCRIPT WHERE GROUP_ID IS NULL OR GROUP_ID = '';

ALTER TABLE SCRIPT DROP PRIMARY KEY;

ALTER TABLE SCRIPT ADD CONSTRAINT PRIMARY KEY (GROUP_ID, ID);

DELETE FROM TEMPLATE;

ALTER TABLE TEMPLATE ADD COLUMN GROUP_ID VARCHAR(255) NOT NULL;

ALTER TABLE TEMPLATE DROP PRIMARY KEY;

ALTER TABLE TEMPLATE ADD CONSTRAINT PRIMARY KEY (GROUP_ID, ID);

INSERT INTO CONFIGURATION (CATEGORY, NAME, VALUE) VALUES ('core', 'update.url', 'http://updates.mirthcorp.com');

INSERT INTO CONFIGURATION (CATEGORY, NAME, VALUE) VALUES ('core', 'update.enabled', '1');

INSERT INTO CONFIGURATION (CATEGORY, NAME, VALUE) VALUES ('core', 'stats.enabled', '1');

INSERT INTO CONFIGURATION (CATEGORY, NAME, VALUE) VALUES ('core', 'firstlogin', '1');

INSERT INTO CONFIGURATION (CATEGORY, NAME, VALUE) VALUES ('core', 'server.resetglobalvariables', '1');

INSERT INTO CONFIGURATION (CATEGORY, NAME, VALUE) VALUES ('core', 'smtp.auth', '0');

INSERT INTO CONFIGURATION (CATEGORY, NAME, VALUE) VALUES ('core', 'smtp.secure', '0');