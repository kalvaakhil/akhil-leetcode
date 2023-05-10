select actor_id,director_id From ActorDirector  GROUP BY actor_id,director_id HAVING COUNT(timestamp)>=3;
