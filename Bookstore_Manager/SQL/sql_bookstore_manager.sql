DROP DATABASE IF EXISTS library_project;

CREATE DATABASE library_project;
USE library_project;

CREATE TABLE book (
	id INT AUTO_INCREMENT,
  isbn VARCHAR(20) UNIQUE NOT NULL,
  type VARCHAR(30) NOT NULL,
  price INT UNSIGNED NOT NULL,
  
  PRIMARY KEY (id)
);

SELECT * FROM book;
DROP TABLE book;