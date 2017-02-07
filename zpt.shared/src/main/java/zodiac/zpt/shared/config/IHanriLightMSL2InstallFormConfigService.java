package zodiac.zpt.shared.config;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IHanriLightMSL2InstallFormConfigService extends IService {

	HanriLightMSL2InstallFormConfigTablePageData getHanriLightMSL2InstallFormConfigTableData(SearchFilter filter);
}
