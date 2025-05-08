package cds.gen.northwindservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2025-05-08T11:37:30.588537316Z",
    comments = "com.sap.cds:cds-maven-plugin:3.8.0 / com.sap.cds:cds4j-api:3.8.0"
)
@CdsName("NorthwindService")
public interface NorthwindService_ {
  String CDS_NAME = "NorthwindService";

  Class<Products_> PRODUCTS = Products_.class;
}
