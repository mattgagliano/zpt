package zodiac.zpt.server.testsites;

import org.eclipse.scout.rt.server.jdbc.lookup.AbstractSqlLookupService;

import zodiac.zpt.server.sql.SQLs;
import zodiac.zpt.shared.testsites.IAutomationModelsLookupService;

public class AutomationModelsLookupService extends AbstractSqlLookupService<String>
		implements IAutomationModelsLookupService {
	
	@Override
	protected String getConfiguredSqlSelect() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!------automodel lookup");
	    return SQLs.AUTOMATIONMODELS_LOOKUP; 
	}
}
