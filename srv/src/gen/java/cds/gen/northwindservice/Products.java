package cds.gen.northwindservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("NorthwindService.Products")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-05-08T11:37:30.588537316Z",
    comments = "com.sap.cds:cds-maven-plugin:3.8.0 / com.sap.cds:cds4j-api:3.8.0"
)
public interface Products extends CdsData {
  String PRODUCT_ID = "ProductID";

  String PRODUCT_NAME = "ProductName";

  String CATEGORY_ID = "CategoryID";

  String QUANTITY_PER_UNIT = "QuantityPerUnit";

  String UNIT_PRICE = "UnitPrice";

  String UNITS_IN_STOCK = "UnitsInStock";

  String UNITS_ON_ORDER = "UnitsOnOrder";

  String REORDER_LEVEL = "ReorderLevel";

  String DISCONTINUED = "Discontinued";

  @CdsName(PRODUCT_ID)
  Integer getProductID();

  @CdsName(PRODUCT_ID)
  void setProductID(Integer productID);

  @CdsName(PRODUCT_NAME)
  String getProductName();

  @CdsName(PRODUCT_NAME)
  void setProductName(String productName);

  @CdsName(CATEGORY_ID)
  Integer getCategoryID();

  @CdsName(CATEGORY_ID)
  void setCategoryID(Integer categoryID);

  @CdsName(QUANTITY_PER_UNIT)
  String getQuantityPerUnit();

  @CdsName(QUANTITY_PER_UNIT)
  void setQuantityPerUnit(String quantityPerUnit);

  @CdsName(UNIT_PRICE)
  BigDecimal getUnitPrice();

  @CdsName(UNIT_PRICE)
  void setUnitPrice(BigDecimal unitPrice);

  @CdsName(UNITS_IN_STOCK)
  Integer getUnitsInStock();

  @CdsName(UNITS_IN_STOCK)
  void setUnitsInStock(Integer unitsInStock);

  @CdsName(UNITS_ON_ORDER)
  Integer getUnitsOnOrder();

  @CdsName(UNITS_ON_ORDER)
  void setUnitsOnOrder(Integer unitsOnOrder);

  @CdsName(REORDER_LEVEL)
  Integer getReorderLevel();

  @CdsName(REORDER_LEVEL)
  void setReorderLevel(Integer reorderLevel);

  @CdsName(DISCONTINUED)
  Boolean getDiscontinued();

  @CdsName(DISCONTINUED)
  void setDiscontinued(Boolean discontinued);

  Products_ ref();

  static Products create() {
    return Struct.create(Products.class);
  }

  static Products of(Map<String, Object> map) {
    return Struct.access(map).as(Products.class);
  }

  static Products create(Integer productID) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(PRODUCT_ID, productID);
    return Struct.access(keys).as(Products.class);
  }
}
