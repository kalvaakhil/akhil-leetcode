select e1.name as Employee from Employee e Inner Join Employee e1 ON e.id=e1.managerId where e.salary<e1.salary;
