# Write your MySQL query statement below
select p.project_id, round(AVG(experience_years),2) as average_years 
from Employee e , Project p where e.employee_id=p.employee_id
group by p.project_id; 