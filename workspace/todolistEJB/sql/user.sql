DROP TABLE groups;
DROP TABLE users;

CREATE TABLE users (
	username VARCHAR(50) NOT NULL,
	password VARCHAR(100) NOT NULL,
	PRIMARY KEY(username)
);

CREATE TABLE groups (
	username VARCHAR(50) NOT NULL,
	groupname VARCHAR(50) NOT NULL,
	PRIMARY KEY (username, groupname),
	FOREIGN KEY (username) REFERENCES users(username)
);

INSERT INTO users VALUES('admin', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918');
INSERT INTO groups VALUES('admin', 'ADMIN');
INSERT INTO groups VALUES('admin', 'USER');

-- user: admin, password: admin
