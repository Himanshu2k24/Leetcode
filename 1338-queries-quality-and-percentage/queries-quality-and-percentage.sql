select query_name ,
    Round(Sum(rating / position) / count(*),2) As quality,
    Round(Sum(CASE WHEN rating < 3 THEN 1 else 0 END) / count(*) * 100, 2) As poor_query_percentage 
    from Queries
    group by query_name;