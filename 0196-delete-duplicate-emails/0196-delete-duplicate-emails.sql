# Write your MySQL query statement below
delete p from Person p inner join Person n where p.id>n.id and p.email=n.email