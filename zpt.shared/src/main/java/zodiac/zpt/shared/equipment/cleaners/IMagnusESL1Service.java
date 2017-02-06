package zodiac.zpt.shared.equipment.cleaners;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IMagnusESL1Service extends IService {

	MagnusESL1TablePageData getMagnusESL1TableData(SearchFilter filter);
}
