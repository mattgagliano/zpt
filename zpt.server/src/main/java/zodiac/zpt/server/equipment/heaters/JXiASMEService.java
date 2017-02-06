package zodiac.zpt.server.equipment.heaters;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.equipment.heaters.IJXiASMEService;
import zodiac.zpt.shared.equipment.heaters.JXiASMETablePageData;

public class JXiASMEService implements IJXiASMEService {

	@Override
	public JXiASMETablePageData getJXiASMETableData(SearchFilter filter) {
		JXiASMETablePageData pageData = new JXiASMETablePageData();
		// TODO [Matt.Gagliano] fill pageData.
		return pageData;
	}
}
