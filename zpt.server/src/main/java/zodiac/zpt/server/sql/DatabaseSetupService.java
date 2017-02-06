package zodiac.zpt.server.sql;

import java.util.Set;

import javax.annotation.PostConstruct;

import org.eclipse.scout.rt.platform.ApplicationScoped;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.CreateImmediately;
import org.eclipse.scout.rt.platform.config.CONFIG;
import org.eclipse.scout.rt.platform.context.RunContext;
import org.eclipse.scout.rt.platform.exception.ExceptionHandler;
import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.platform.holders.StringArrayHolder;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.platform.util.concurrent.IRunnable;
import org.eclipse.scout.rt.server.jdbc.SQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// tag::service[]
@ApplicationScoped
@CreateImmediately
public class DatabaseSetupService implements IDataStoreService {
  private static final Logger LOG = LoggerFactory.getLogger(DatabaseSetupService.class);

  @PostConstruct
  public void autoCreateDatabase() {
    if (CONFIG.getPropertyValue(DatabaseProperties.DatabaseAutoCreateProperty.class)) {
      try {
        RunContext context = BEANS.get(SuperUserRunContextProducer.class).produce();
        IRunnable runnable = new IRunnable() {

          @Override
          public void run() throws Exception {
        	  //SQLm.Create_ZPT_TABLES();
              createTestSitesTable();
              createHanriLightTable();
          }
        };

        context.run(runnable);
      }
      catch (RuntimeException e) {
        BEANS.get(ExceptionHandler.class).handle(e);
      }
    }
  }

  public void createTestSitesTable() {
    if (!getExistingTables().contains("TESTSITES")) {
    	SQL.insert(SQLs.TESTSITES_CREATE_TABLE);
        LOG.info("Database table 'TESTSITES' created");
    }
    
    if (CONFIG.getPropertyValue(DatabaseProperties.DatabaseAutoPopulateProperty.class)) {
        SQL.insert(SQLs.TESTSITES_INSERT_SAMPLE + SQLs.TESTSITES_VALUES_01);
        SQL.insert(SQLs.TESTSITES_INSERT_SAMPLE + SQLs.TESTSITES_VALUES_02);
        SQL.insert(SQLs.TESTSITES_INSERT_SAMPLE + SQLs.TESTSITES_VALUES_03);
        SQL.insert(SQLs.TESTSITES_INSERT_SAMPLE + SQLs.TESTSITES_VALUES_04);
        LOG.info("Database table 'TESTSITES' populated with sample data");
    }
  }
  
  public void createTables() {
	  //write create ZPT_TABLES
	  //read table names out of ZPT_TABLES
	  //for loop create & auto populate
	  
	  SQLm.Create_ZPT_TABLES();
	  
  }
  
  public void createHanriLightTable() {
	  if (!getExistingTables().contains("HANRILIGHT")) {
		  SQL.insert(SQLs.HANRILIGHT_CREATE_TABLE);
		  LOG.info("Database table 'HANRILIGHT' created");
	  }
	  
	  if (CONFIG.getPropertyValue(DatabaseProperties.DatabaseAutoPopulateProperty.class)) {
		//  SQL.insert(SQLs.HANRILIGHT_INSERT_SAMPLE + SQLs.HANRILIGHT_VALUES_01);
	    //  LOG.info("Database table 'HANRILIGHT' populated with sample data");
	  }
  }

  private Set<String> getExistingTables() {
    StringArrayHolder tables = new StringArrayHolder();
    SQL.selectInto(SQLm.Select_Table_Names(), new NVPair("result", tables)); // <1>
    return CollectionUtility.hashSet(tables.getValue());
  }
  // end::service[]

  @Override
  public void dropDataStore() {
    SQL.update(SQLs.TESTSITES_DROP_TABLE);
    SQL.update(SQLs.HANRILIGHT_DROP_TABLE);
  }

  @Override
  public void createDataStore() {
    
	 //createTables();
	  createTestSitesTable();
    createHanriLightTable();
  }
  // tag::service[]
}
// end::service[]
