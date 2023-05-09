select unique_id,name FROM Employees e LEFT JOIN EmployeeUNI eu ON e.id=eu.id;
# select unique_id,name from employees e left join  employeeuni eu on
# e.id=eu.id