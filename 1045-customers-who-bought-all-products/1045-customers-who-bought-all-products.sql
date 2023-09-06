# Write your MySQL query statement below
Select Customer_Id 
From Customer 
Group By Customer_Id 
Having Count(Distinct(Product_Key)) = 
(Select COUNT(*) from Product);