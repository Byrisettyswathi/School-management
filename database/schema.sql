create database schooldb;
use schooldb;

CREATE TABLE teacher (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    subject VARCHAR(255)
);

CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    class_name VARCHAR(20),
    roll_number INT,
    teacher_id INT,
    CONSTRAINT fk_teacher FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);