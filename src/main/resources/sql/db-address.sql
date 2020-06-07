CREATE SCHEMA IF NOT EXISTS jdbc_schema;

CREATE TABLE IF NOT EXISTS Address
(
    ID      int AUTO_INCREMENT PRIMARY KEY,
    CITY    varchar(50),
    STREET_NAME varchar(50),
    POST_CODE varchar

);