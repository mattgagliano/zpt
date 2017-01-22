package zodiac.zpt.server.testsites;

import org.eclipse.scout.rt.server.jdbc.lookup.AbstractSqlLookupService;

import zodiac.zpt.server.sql.SQLs;
import zodiac.zpt.shared.testsites.ITESTSITES_AutomationModelLookupService;

public class TESTSITES_AutomationModelLookupService extends AbstractSqlLookupService<String>
		implements ITESTSITES_AutomationModelLookupService {
	
	@Override
	protected String getConfiguredSqlSelect() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!------automodel lookup");
	    return SQLs.TESTSITES_AutomationModelLOOKUP; 
	}
}
