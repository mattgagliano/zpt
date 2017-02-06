package zodiac.zpt.server.equipment.cleaners;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.equipment.cleaners.IMagnusESL1Service;
import zodiac.zpt.shared.equipment.cleaners.MagnusESL1TablePageData;

public class MagnusESL1Service implements IMagnusESL1Service {

	@Override
	public MagnusESL1TablePageData getMagnusESL1TableData(SearchFilter filter) {
		MagnusESL1TablePageData pageData = new MagnusESL1TablePageData();
		// TODO [Matt.Gagliano] fill pageData.
		return pageData;
	}
}
