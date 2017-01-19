package zodiac.zpt.shared.testsites;

import java.security.BasicPermission;

public class ReadTestSitePermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public ReadTestSitePermission() {
		super(ReadTestSitePermission.class.getSimpleName());
	}
}
