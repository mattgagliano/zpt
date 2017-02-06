package zodiac.zpt.shared.equipment.heaters;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IJXiASMEESL2Service extends IService {

	JXiASMEESL2TablePageData getJXiASMEESL2TableData(SearchFilter filter);
}
