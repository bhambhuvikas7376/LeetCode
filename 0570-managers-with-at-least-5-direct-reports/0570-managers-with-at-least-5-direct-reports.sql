# Write your MySQL query statement below
select e.name 
from Employee e inner join Employee m on e.id=m.managerID
group by m.managerId having count(*)>=5