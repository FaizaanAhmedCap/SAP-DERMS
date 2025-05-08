package cds.gen.northwindservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.cds.RemoteService;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2025-05-08T11:37:30.588537316Z",
    comments = "com.sap.cds:cds-maven-plugin:3.8.0 / com.sap.cds:cds4j-api:3.8.0"
)
@CdsName(NorthwindService_.CDS_NAME)
public interface NorthwindService extends CqnService {
  interface Application extends ApplicationService, NorthwindService {
  }

  interface Remote extends RemoteService, NorthwindService {
  }
}
