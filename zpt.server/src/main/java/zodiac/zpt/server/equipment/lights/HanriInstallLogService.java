package zodiac.zpt.server.equipment.lights;

import java.util.UUID;

import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.platform.util.StringUtility;
import org.eclipse.scout.rt.server.jdbc.SQL;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;

import zodiac.zpt.server.sql.SQLs;
import zodiac.zpt.shared.equipment.lights.CreateHanriInstallLogPermission;
import zodiac.zpt.shared.equipment.lights.HanriInstallLogFormData;
import zodiac.zpt.shared.equipment.lights.IHanriInstallLogService;
import zodiac.zpt.shared.equipment.lights.ReadHanriInstallLogPermission;
import zodiac.zpt.shared.equipment.lights.UpdateHanriInstallLogPermission;

public class HanriInstallLogService implements IHanriInstallLogService {

	@Override
	public HanriInstallLogFormData prepareCreate(HanriInstallLogFormData formData) {
		if (!ACCESS.check(new CreateHanriInstallLogPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [gagli] add business logic here.
		return formData;
	}

	@Override
	public HanriInstallLogFormData create(HanriInstallLogFormData formData) {
		if (!ACCESS.check(new CreateHanriInstallLogPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		
		if (StringUtility.isNullOrEmpty(formData.getHanriLightId())) {
		      formData.setHanriLightId(UUID.randomUUID().toString());
		}
		
		SQL.insert(SQLs.HANRILIGHT_INSERT, formData); 
		
		return store(formData);
	}

	@Override
	public HanriInstallLogFormData load(HanriInstallLogFormData formData) {
		if (!ACCESS.check(new ReadHanriInstallLogPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}

		SQL.selectInto(SQLs.HANRILIGHT_SELECT, formData);
		
		return formData;
	}

	@Override
	public HanriInstallLogFormData store(HanriInstallLogFormData formData) {
		if (!ACCESS.check(new UpdateHanriInstallLogPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		
		SQL.update(SQLs.HANRILIGHT_UPDATE, formData);
		
		return formData;
	}
}
