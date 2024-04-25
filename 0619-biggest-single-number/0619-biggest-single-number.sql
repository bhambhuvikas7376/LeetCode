# Write your MySQL query statement below
select IFNULL(max(num),null) as num
from MyNumbers where num in (select num from MyNumbers group by num having count(*)=1)