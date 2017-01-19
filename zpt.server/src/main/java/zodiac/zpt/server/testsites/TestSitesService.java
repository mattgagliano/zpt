package zodiac.zpt.server.testsites;

import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.server.jdbc.SQL;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.server.sql.SQLs;
import zodiac.zpt.shared.testsites.ITestSitesService;
import zodiac.zpt.shared.testsites.TestSitesTablePageData;

public class TestSitesService implements ITestSitesService {

	@Override
	public TestSitesTablePageData getTestSitesTableData(SearchFilter filter) {
		TestSitesTablePageData pageData = new TestSitesTablePageData();
		
		String sql = SQLs.TESTSITES_PAGE_SELECT + SQLs.TESTSITES_PAGE_DATA_SELECT_INTO;
        SQL.selectInto(sql, new NVPair("page", pageData));
		
		return pageData;
	}
}
