package zodiac.zpt.server.config;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.config.ITestProjectsConfigService;
import zodiac.zpt.shared.config.TestProjectsConfigTablePageData;

public class TestProjectsConfigService implements ITestProjectsConfigService {

	@Override
	public TestProjectsConfigTablePageData getTestProjectsConfigTableData(SearchFilter filter) {
		TestProjectsConfigTablePageData pageData = new TestProjectsConfigTablePageData();
		// TODO [gagli] fill pageData.
		return pageData;
	}
}
