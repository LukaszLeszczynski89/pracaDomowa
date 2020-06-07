//jdbc:h2:tcp://localhost/~/db/jdbc-database

CREATE SCHEMA IF NOT EXISTS jdbc_schema;

CREATE TABLE IF NOT EXISTS Persons
(
    ID      int AUTO_INCREMENT PRIMARY KEY,
    NAME    varchar(50),
    GENDER varchar(50)
);