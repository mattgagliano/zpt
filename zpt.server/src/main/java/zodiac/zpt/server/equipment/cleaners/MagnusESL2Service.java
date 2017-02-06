package zodiac.zpt.server.equipment.cleaners;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.equipment.cleaners.IMagnusESL2Service;
import zodiac.zpt.shared.equipment.cleaners.MagnusESL2TablePageData;

public class MagnusESL2Service implements IMagnusESL2Service {

	@Override
	public MagnusESL2TablePageData getMagnusESL2TableData(SearchFilter filter) {
		MagnusESL2TablePageData pageData = new MagnusESL2TablePageData();
		// TODO [Matt.Gagliano] fill pageData.
		return pageData;
	}
}
