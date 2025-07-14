-- Write your PostgreSQL query statement below

SELECT Department, Employee, Salary
FROM
(SELECT d.name As Department, 
e.name AS Employee, 
Salary,
DENSE_RANK() OVER(
    Partition BY departmentid
    ORDER BY salary DESC
) AS rn 
FROM Employee e
JOIN Department d
ON e.departmentId = d.id)
WHERE rn<= 3 