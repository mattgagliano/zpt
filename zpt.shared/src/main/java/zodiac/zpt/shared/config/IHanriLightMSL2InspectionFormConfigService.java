package zodiac.zpt.shared.config;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IHanriLightMSL2InspectionFormConfigService extends IService {

	HanriLightMSL2InspectionFormConfigTablePageData getHanriLightMSL2InspectionFormConfigTableData(SearchFilter filter);
}
