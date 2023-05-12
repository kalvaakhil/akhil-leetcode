# select * from Patients where Patients.conditions LIKE "%DIAB1%" OR conditions LIKE "DIAB1%";
SELECT * FROM Patients
WHERE conditions  LIKE '% DIAB1%' OR conditions LIKE "DIAB1%";
# SELECT * FROM Patients
# WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%';