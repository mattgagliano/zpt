package zodiac.zpt.shared.equipment.lights;

import java.security.BasicPermission;

public class CreateHanriInstallLogPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public CreateHanriInstallLogPermission() {
		super(CreateHanriInstallLogPermission.class.getSimpleName());
	}
}
