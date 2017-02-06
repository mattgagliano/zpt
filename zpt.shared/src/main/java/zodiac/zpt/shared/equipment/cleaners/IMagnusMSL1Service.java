package zodiac.zpt.shared.equipment.cleaners;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IMagnusMSL1Service extends IService {

	MagnusMSL1TablePageData getMagnusMSL1TableData(SearchFilter filter);
}
