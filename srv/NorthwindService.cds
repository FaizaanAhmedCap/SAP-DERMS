service NorthwindService {
    entity Products {
        key ProductID : Integer;
        ProductName   : String;
        CategoryID    : Integer;
        QuantityPerUnit : String;
        UnitPrice     : Decimal;
        UnitsInStock  : Integer;
        UnitsOnOrder  : Integer;
        ReorderLevel  : Integer;
        Discontinued  : Boolean;
    }
}
