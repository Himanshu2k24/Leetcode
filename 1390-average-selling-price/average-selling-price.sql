# Write your MySQL query statement below
select p.product_id , 
    Round(IFNULL(sum(u.units * p.price) / sum(u.units),0),2) As average_price 
    from Prices AS p
    left JOIN UnitsSold  As u
    On u.product_id = p.product_id
    AND u.purchase_date Between start_date  and end_date
    group by product_id;