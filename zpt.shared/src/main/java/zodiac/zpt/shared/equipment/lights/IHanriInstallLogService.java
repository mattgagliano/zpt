package zodiac.zpt.shared.equipment.lights;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

@TunnelToServer
public interface IHanriInstallLogService extends IService {

	HanriInstallLogFormData prepareCreate(HanriInstallLogFormData formData);

	HanriInstallLogFormData create(HanriInstallLogFormData formData);

	HanriInstallLogFormData load(HanriInstallLogFormData formData);

	HanriInstallLogFormData store(HanriInstallLogFormData formData);
}
