package zodiac.zpt.server.equipment.heaters;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.equipment.heaters.IJXiASMEESL2Service;
import zodiac.zpt.shared.equipment.heaters.JXiASMEESL2TablePageData;

public class JXiASMEESL2Service implements IJXiASMEESL2Service {

	@Override
	public JXiASMEESL2TablePageData getJXiASMEESL2TableData(SearchFilter filter) {
		JXiASMEESL2TablePageData pageData = new JXiASMEESL2TablePageData();
		// TODO [Matt.Gagliano] fill pageData.
		return pageData;
	}
}
