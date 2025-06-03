-- Question 1
SELECT COUNT(*) 
FROM northwind.suppliers;

-- Question 2
SELECT SUM(salary) 
FROM northwind.employees;

-- Question 3
SELECT MIN(unitprice) 
FROM northwind.products;

-- Question 4
SELECT AVG(unitprice) 
FROM northwind.products;

-- Question 5
SELECT MAX(unitprice) 
FROM northwind.products;

-- Question 6
SELECT SupplierID, COUNT(*) 
FROM Products
GROUP BY SupplierID;

-- Question 7
