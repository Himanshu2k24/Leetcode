# Write your MySQL query statement below
select Distinct(author_id) As id from views
where author_id = viewer_id
Order by author_id ASC