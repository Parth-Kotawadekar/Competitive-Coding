-- Write your PostgreSQL query statement below
select 
    (case when c=1 then num else null end) as num
from
    (select num, count(num) as c from MyNumbers group by num)
order by c asc, num desc limit 1