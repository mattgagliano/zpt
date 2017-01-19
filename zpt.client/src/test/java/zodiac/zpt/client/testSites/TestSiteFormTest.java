package zodiac.zpt.client.testSites;

import org.eclipse.scout.rt.client.testenvironment.TestEnvironmentClientSession;
import org.eclipse.scout.rt.testing.client.runner.ClientTestRunner;
import org.eclipse.scout.rt.testing.client.runner.RunWithClientSession;
import org.eclipse.scout.rt.testing.platform.mock.BeanMock;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;

import zodiac.zpt.shared.testsites.ITestSiteService;
import zodiac.zpt.shared.testsites.TestSiteFormData;

@RunWithSubject("anonymous")
@RunWith(ClientTestRunner.class)
@RunWithClientSession(TestEnvironmentClientSession.class)
public class TestSiteFormTest {

	@BeanMock
	private ITestSiteService m_mockSvc;

	@Before
	public void setup() {
		TestSiteFormData answer = new TestSiteFormData();
		Mockito.when(m_mockSvc.prepareCreate(Matchers.any(TestSiteFormData.class))).thenReturn(answer);
		Mockito.when(m_mockSvc.create(Matchers.any(TestSiteFormData.class))).thenReturn(answer);
		Mockito.when(m_mockSvc.load(Matchers.any(TestSiteFormData.class))).thenReturn(answer);
		Mockito.when(m_mockSvc.store(Matchers.any(TestSiteFormData.class))).thenReturn(answer);
	}

	// TODO [gagli] add test cases
}
