package zodiac.zpt.shared.equipment.lights;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IHanriLightService extends IService {

	HanriLightTablePageData getHanriLightTableData(SearchFilter filter);
}
