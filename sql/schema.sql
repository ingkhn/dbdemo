DROP SCHEMA IF EXISTS school;
CREATE SCHEMA school;
USE school;

CREATE TABLE Course (
                        course_id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
                        title VARCHAR(45) NOT NULL,
                        description VARCHAR(45) NOT NULL,
                        PRIMARY KEY  (course_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE Student (
                         student_id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
                         first_name VARCHAR(45) NOT NULL,
                         last_name VARCHAR(45) NOT NULL,
                         course_id SMALLINT UNSIGNED,
                         PRIMARY KEY  (student_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO Student (student_id, first_name, last_name, course_id)
VALUES (1, 'Sergey', 'Lukichev', 2),
       (2, 'Sasha', 'Ivanov', 1),
       (3, 'Anna', 'Ivanova', 1),
       (4, 'Andrey', 'Petrov', NULL),
       (5, 'Oleg', 'Vasiliev', 1),
       (6, 'Lena', 'Mustermann', 1),
       (7, 'Alex', 'Müller', NULL);

INSERT INTO Course (course_id, title, description)
VALUES (1, 'Java', 'Java Basics'),
       (2, 'QA', 'Testing'),
       (3, 'Angular', 'FE');

