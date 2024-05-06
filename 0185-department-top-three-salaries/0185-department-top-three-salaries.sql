# Write your MySQL query statement below
select d.name as Department,x.name as Employee, x.salary as Salary 
from
(select *, DENSE_Rank() over(partition by departmentID order by salary desc) as rnk from Employee )x ,Department d where x.departmentId=d.id and rnk <=3;