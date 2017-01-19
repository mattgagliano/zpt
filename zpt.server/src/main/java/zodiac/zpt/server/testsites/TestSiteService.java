package zodiac.zpt.server.testsites;

import java.util.UUID;

import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.platform.util.StringUtility;
import org.eclipse.scout.rt.server.jdbc.SQL;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;

import zodiac.zpt.server.sql.SQLs;
import zodiac.zpt.shared.testsites.CreateTestSitePermission;
import zodiac.zpt.shared.testsites.ITestSiteService;
import zodiac.zpt.shared.testsites.ReadTestSitePermission;
import zodiac.zpt.shared.testsites.TestSiteFormData;
import zodiac.zpt.shared.testsites.UpdateTestSitePermission;

public class TestSiteService implements ITestSiteService {

	@Override
	public TestSiteFormData prepareCreate(TestSiteFormData formData) {
		if (!ACCESS.check(new CreateTestSitePermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [gagli] add business logic here.
		return formData;
	}

	@Override
	public TestSiteFormData create(TestSiteFormData formData) {
		if (!ACCESS.check(new CreateTestSitePermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		
		if (StringUtility.isNullOrEmpty(formData.getSiteId())) {
		      formData.setSiteId(UUID.randomUUID().toString());
		}
		
		SQL.insert(SQLs.TESTSITES_INSERT, formData); 

	    return store(formData);
	}

	@Override
	public TestSiteFormData load(TestSiteFormData formData) {
		if (!ACCESS.check(new ReadTestSitePermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		
		SQL.selectInto(SQLs.TESTSITES_SELECT, formData);
		
		return formData;
	}

	@Override
	public TestSiteFormData store(TestSiteFormData formData) {
		if (!ACCESS.check(new UpdateTestSitePermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		
		SQL.update(SQLs.TESTSITES_UPDATE, formData);
		
		return formData;
	}
}
