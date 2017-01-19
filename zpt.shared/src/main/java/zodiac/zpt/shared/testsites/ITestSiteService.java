package zodiac.zpt.shared.testsites;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

import zodiac.zpt.shared.testsites.TestSiteFormData;

@TunnelToServer
public interface ITestSiteService extends IService {

	TestSiteFormData prepareCreate(TestSiteFormData formData);

	TestSiteFormData create(TestSiteFormData formData);

	TestSiteFormData load(TestSiteFormData formData);

	TestSiteFormData store(TestSiteFormData formData);
}
