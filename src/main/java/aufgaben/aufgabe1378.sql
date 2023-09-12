--Replace Employee ID With The Unique Identifier
select Employees.name, EmployeeUNI.unique_id from Employees left join EmployeeUNI on Employees.id = EmployeeUNI.id