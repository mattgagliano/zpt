package zodiac.zpt.server.config;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.config.ITestSiteFormConfigService;
import zodiac.zpt.shared.config.TestSiteFormConfigTablePageData;

public class TestSiteFormConfigService implements ITestSiteFormConfigService {

	@Override
	public TestSiteFormConfigTablePageData getTestSiteFormConfigTableData(SearchFilter filter) {
		TestSiteFormConfigTablePageData pageData = new TestSiteFormConfigTablePageData();
		// TODO [gagli] fill pageData.
		return pageData;
	}
}
