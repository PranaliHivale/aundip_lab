mysql> use university_database;
Database changed
mysql> show tables;
+-------------------------------+
| Tables_in_university_database |
+-------------------------------+
| enrollement                   |
| student                       |
+-------------------------------+
2 rows in set (0.01 sec)

mysql> select * from student;
+------------+------------+-----------+--------------------------+
| student_id | frist_name | last_name | email                    |
+------------+------------+-----------+--------------------------+
| s101       | Pranali    | Hivale    | pranalihivale@gmail.com  |
| s102       | Shweta     | Mestry    | shwetamestry@gmail.com   |
| s103       | Shruti     | Deshmukh  | shrutideshmukh@gmail.com |
| s104       | Ayushi     | Bhende    | ayushibhende@gmail.com   |
| s105       | Rutuja     | Hivale    | rutujahivale@gmail.com   |
| s106       | Nikhil     | Mane      | nikhilmane@gmail.com     |
+------------+------------+-----------+--------------------------+
6 rows in set (0.04 sec)

mysql> select * from enrollement;
+----------------+------------+-----------+------------------+----------------+
| enrollement_id | student_id | course_id | enrollement_date | course_name    |
+----------------+------------+-----------+------------------+----------------+
| A0230          | s101       | c1004     | 2025-09-05       | Python         |
| A0234          | s106       | c1001     | 2023-12-07       | CSE-AIML       |
| A0235          | s102       | c1002     | 2023-06-07       | Adv Java       |
| A0236          | s101       | c1003     | 2025-06-12       | Cyber Security |
| A0237          | s103       | c1002     | 2025-08-15       | Adv Java       |
| A0239          | s104       | c1003     | 2025-06-13       | Cyber Security |
+----------------+------------+-----------+------------------+----------------+
6 rows in set (0.00 sec)

mysql> select s.student_id,s.frist_name,s.last_name,e.enrollement_id,e.course_id from student s inner join enrollement e on s.student_id=e.student_id;
+------------+------------+-----------+----------------+-----------+
| student_id | frist_name | last_name | enrollement_id | course_id |
+------------+------------+-----------+----------------+-----------+
| s101       | Pranali    | Hivale    | A0230          | c1004     |
| s101       | Pranali    | Hivale    | A0236          | c1003     |
| s102       | Shweta     | Mestry    | A0235          | c1002     |
| s103       | Shruti     | Deshmukh  | A0237          | c1002     |
| s104       | Ayushi     | Bhende    | A0239          | c1003     |
| s106       | Nikhil     | Mane      | A0234          | c1001     |
+------------+------------+-----------+----------------+-----------+
6 rows in set (0.02 sec)