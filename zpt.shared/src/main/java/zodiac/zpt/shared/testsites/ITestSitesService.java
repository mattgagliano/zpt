package zodiac.zpt.shared.testsites;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.testsites.TestSitesTablePageData;

@TunnelToServer
public interface ITestSitesService extends IService {

	TestSitesTablePageData getTestSitesTableData(SearchFilter filter);
}
