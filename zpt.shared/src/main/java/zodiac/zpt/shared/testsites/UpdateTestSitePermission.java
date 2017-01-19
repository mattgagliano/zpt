package zodiac.zpt.shared.testsites;

import java.security.BasicPermission;

public class UpdateTestSitePermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public UpdateTestSitePermission() {
		super(UpdateTestSitePermission.class.getSimpleName());
	}
}
