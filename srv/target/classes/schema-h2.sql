
DROP TABLE IF EXISTS NorthwindService_Products;

CREATE TABLE NorthwindService_Products (
  ProductID INTEGER NOT NULL,
  ProductName NVARCHAR(255),
  CategoryID INTEGER,
  QuantityPerUnit NVARCHAR(255),
  UnitPrice DECFLOAT,
  UnitsInStock INTEGER,
  UnitsOnOrder INTEGER,
  ReorderLevel INTEGER,
  Discontinued BOOLEAN,
  PRIMARY KEY(ProductID)
);

