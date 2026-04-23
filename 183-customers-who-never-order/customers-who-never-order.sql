# Write your MySQL query statement below
select c.name as Customers
from Customers as c
left join Orders as o
On o.CustomerId = c.id
where CustomerId is null;