package zodiac.zpt.shared.equipment.heaters;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IJXiASMEMSL2Service extends IService {

	JXiASMEMSL2TablePageData getJXiASMEMSL2TableData(SearchFilter filter);
}
