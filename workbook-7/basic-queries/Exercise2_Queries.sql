-- Question 1
SELECT * 
FROM northwind.categories;

-- Question 2
SELECT productid, productname, unitprice
FROM northwind.products;

-- Question 3
SELECT productid, productname, unitprice
FROM northwind.products
ORDER BY unitprice;

-- Question 4
SELECT productid, productname, unitprice
FROM northwind.products
WHERE unitprice <= 7.50;

-- Question 5
SELECT productid, productname, unitprice
FROM northwind.products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;

-- Question 6
SELECT productid, productname, unitprice
FROM northwind.products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC, productname ASC;

-- Question 7
SELECT productid, productname, unitprice
FROM northwind.products



