Select u.name,IFNULL(sum(r.distance),0) as travelled_distance
from Users u
LEFT JOIN Rides r
ON u.id=r.user_id 
GROUP BY r.user_id
order by travelled_distance desc,
name asc;
# SELECT Users.name, IFNULL(SUM(Rides.distance), 0) AS travelled_distance
# FROM Users LEFT JOIN Rides
# ON Users.id = Rides.user_id
# GROUP BY user_id
# ORDER BY travelled_distance DESC,
# name ASC; 
