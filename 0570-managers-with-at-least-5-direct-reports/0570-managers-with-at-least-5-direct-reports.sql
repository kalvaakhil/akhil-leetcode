
select name
from Employee 
where id in 
(select managerId 
 from Employee 
 group by managerId
 having 
 Count(id)>=5)
 ;