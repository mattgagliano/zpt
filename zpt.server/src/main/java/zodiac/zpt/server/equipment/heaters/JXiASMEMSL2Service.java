package zodiac.zpt.server.equipment.heaters;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.equipment.heaters.IJXiASMEMSL2Service;
import zodiac.zpt.shared.equipment.heaters.JXiASMEMSL2TablePageData;

public class JXiASMEMSL2Service implements IJXiASMEMSL2Service {

	@Override
	public JXiASMEMSL2TablePageData getJXiASMEMSL2TableData(SearchFilter filter) {
		JXiASMEMSL2TablePageData pageData = new JXiASMEMSL2TablePageData();
		// TODO [Matt.Gagliano] fill pageData.
		return pageData;
	}
}
