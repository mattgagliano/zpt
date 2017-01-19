package zodiac.zpt.client.equipment.lights;

import org.eclipse.scout.rt.client.testenvironment.TestEnvironmentClientSession;
import org.eclipse.scout.rt.testing.client.runner.ClientTestRunner;
import org.eclipse.scout.rt.testing.client.runner.RunWithClientSession;
import org.eclipse.scout.rt.testing.platform.mock.BeanMock;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;

import zodiac.zpt.shared.equipment.lights.HanriInstallLogFormData;
import zodiac.zpt.shared.equipment.lights.IHanriInstallLogService;

@RunWithSubject("anonymous")
@RunWith(ClientTestRunner.class)
@RunWithClientSession(TestEnvironmentClientSession.class)
public class HanriInstallLogFormTest {

	@BeanMock
	private IHanriInstallLogService m_mockSvc;

	@Before
	public void setup() {
		HanriInstallLogFormData answer = new HanriInstallLogFormData();
		Mockito.when(m_mockSvc.prepareCreate(Matchers.any(HanriInstallLogFormData.class))).thenReturn(answer);
		Mockito.when(m_mockSvc.create(Matchers.any(HanriInstallLogFormData.class))).thenReturn(answer);
		Mockito.when(m_mockSvc.load(Matchers.any(HanriInstallLogFormData.class))).thenReturn(answer);
		Mockito.when(m_mockSvc.store(Matchers.any(HanriInstallLogFormData.class))).thenReturn(answer);
	}

	// TODO [gagli] add test cases
}
