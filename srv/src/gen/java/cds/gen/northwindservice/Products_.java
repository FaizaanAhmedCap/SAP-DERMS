package cds.gen.northwindservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@CdsName("NorthwindService.Products")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-05-08T11:37:30.588537316Z",
    comments = "com.sap.cds:cds-maven-plugin:3.8.0 / com.sap.cds:cds4j-api:3.8.0"
)
public interface Products_ extends StructuredType<Products_> {
  String PRODUCT_ID = "ProductID";

  String PRODUCT_NAME = "ProductName";

  String CATEGORY_ID = "CategoryID";

  String QUANTITY_PER_UNIT = "QuantityPerUnit";

  String UNIT_PRICE = "UnitPrice";

  String UNITS_IN_STOCK = "UnitsInStock";

  String UNITS_ON_ORDER = "UnitsOnOrder";

  String REORDER_LEVEL = "ReorderLevel";

  String DISCONTINUED = "Discontinued";

  String CDS_NAME = "NorthwindService.Products";

  @CdsName(PRODUCT_ID)
  ElementRef<Integer> ProductID();

  @CdsName(PRODUCT_NAME)
  ElementRef<String> ProductName();

  @CdsName(CATEGORY_ID)
  ElementRef<Integer> CategoryID();

  @CdsName(QUANTITY_PER_UNIT)
  ElementRef<String> QuantityPerUnit();

  @CdsName(UNIT_PRICE)
  ElementRef<BigDecimal> UnitPrice();

  @CdsName(UNITS_IN_STOCK)
  ElementRef<Integer> UnitsInStock();

  @CdsName(UNITS_ON_ORDER)
  ElementRef<Integer> UnitsOnOrder();

  @CdsName(REORDER_LEVEL)
  ElementRef<Integer> ReorderLevel();

  @CdsName(DISCONTINUED)
  ElementRef<Boolean> Discontinued();
}
