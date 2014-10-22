DROP TABLE TODO;

CREATE TABLE todo (
	id INTEGER NOT NULL 
		GENERATED ALWAYS AS IDENTITY 
		(START WITH 1, INCREMENT BY 1),
	titulo VARCHAR(100) NOT NULL,
	texto VARCHAR(500) NOT NULL,
	status INTEGER NOT NULL,
	PRIMARY KEY (id)
);

INSERT INTO TODO(titulo, texto, status)
VALUES('Número 1', 'Texto número 1', 0);
INSERT INTO TODO(titulo, texto, status)
VALUES('Número 2', 'Texto número 2', 0);
INSERT INTO TODO(titulo, texto, status)
VALUES('Número 3', 'Texto número 3', 0);

SELECT * FROM TODO;