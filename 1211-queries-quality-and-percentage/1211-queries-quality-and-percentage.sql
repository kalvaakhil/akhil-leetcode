SELECT 
    query_name,
    ROUND(AVG(rating/position),2) as quality,
    ROUND(AVG(rating<3)*100,2) as poor_query_percentage
FROM Queries
GROUP BY query_name;
# SELECT
#     query_name,
#     ROUND(AVG(rating/position), 2) AS quality,
#     ROUND(AVG(rating < 3)*100, 2) AS poor_query_percentage
# FROM Queries
# GROUP BY query_name
