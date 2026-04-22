# Write your MySQL query statement below
select ee.unique_id , e.name
from Employees as e
left JOIN EmployeeUNI as ee
on ee.id = e.id