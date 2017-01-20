package zodiac.zpt.server.equipment;

import org.eclipse.scout.rt.server.jdbc.lookup.AbstractSqlLookupService;

import zodiac.zpt.server.sql.SQLs;
import zodiac.zpt.shared.equipment.ITestSitesLookupService;

public class TestSitesLookupService extends AbstractSqlLookupService<String> implements ITestSitesLookupService {
	
	@Override
	protected String getConfiguredSqlSelect() {
		return SQLs.TESTSITES_LOOKUP;
	}
}
