package zodiac.zpt.server.equipment.heaters;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.equipment.heaters.IJXiASMEMSL1Service;
import zodiac.zpt.shared.equipment.heaters.JXiASMEMSL1TablePageData;

public class JXiASMEMSL1Service implements IJXiASMEMSL1Service {

	@Override
	public JXiASMEMSL1TablePageData getJXiASMEMSL1TableData(SearchFilter filter) {
		JXiASMEMSL1TablePageData pageData = new JXiASMEMSL1TablePageData();
		// TODO [Matt.Gagliano] fill pageData.
		return pageData;
	}
}
