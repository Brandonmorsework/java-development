-- Question 1
SELECT ProductName, UnitPrice
FROM products
WHERE UnitPrice IN (SELECT MAX(UnitPrice) 
						FROM products);

-- Question 2
SELECT OrderID, ShipName, ShipAddress
FROM orders
WHERE shipvia = (SELECT ShipperID 
				FROM Shippers 
				WHERE CompanyName = "Federal Shipping");

-- Question 3 Incomplete
SELECT orderID
FROM `Order details`
WHERE ProductID = (SELECT ProductID
					FROM products
					WHERE ProductName = "Sasquatch Ale");

-- Question 4
SELECT FirstName, LastName
FROM employees
WHERE EmployeeID IN (SELECT employeeID
					FROM orders
                    WHERE OrderID = "10266");

-- Question 5
SELECT CompanyName
FROM customers
WHERE CustomerID IN (SELECT customerID
					FROM orders
                    WHERE OrderID = "10266");


