package zodiac.zpt.shared.testsites;

import java.security.BasicPermission;

public class CreateTestSitePermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public CreateTestSitePermission() {
		super(CreateTestSitePermission.class.getSimpleName());
	}
}
