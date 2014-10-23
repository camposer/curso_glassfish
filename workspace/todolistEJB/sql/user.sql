DROP TABLE "user";
DROP TABLE "group";

CREATE TABLE "user" (
	username VARCHAR(50) NOT NULL,
	passsword VARCHAR(100) NOT NULL,
	groupname VARCHAR(50),
	PRIMARY KEY(username)
);

CREATE TABLE "group" (
	groupname VARCHAR(50) NOT NULL,
	PRIMARY KEY (groupname)
);

INSERT INTO "user" VALUES('admin', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', 'ADMIN');
INSERT INTO "group" VALUES('ADMIN');
INSERT INTO "group" VALUES('USER');

