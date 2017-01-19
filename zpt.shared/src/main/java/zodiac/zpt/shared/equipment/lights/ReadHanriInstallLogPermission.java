package zodiac.zpt.shared.equipment.lights;

import java.security.BasicPermission;

public class ReadHanriInstallLogPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public ReadHanriInstallLogPermission() {
		super(ReadHanriInstallLogPermission.class.getSimpleName());
	}
}
