// FULL OUTER JOIN
select *
from Student as s
left join Course as c on c.course_id = s.course_id
UNION
select *
from Student as s
right join Course as c on c.course_id = s.course_id;


// выбрать 2 самых посещаемых курса: название курса, количество студентов
select title, COUNT(student_id)
from Course as c
join Student as s on c.course_id = s.course_id
GROUP BY title
ORDER BY count(student_id) DESC
LIMIT 2;


// список студентов на каждом курсе (left join - плюс выведет курсы без студентов)
select title, last_name, first_name
from Course as c
join Student as s on c.course_id = s.course_id
ORDER BY title, last_name;


// курсы, на которые никто не записан
select title
from Course as c
left join Student as s on c.course_id = s.course_id
WHERE s.course_id IS NULL;
