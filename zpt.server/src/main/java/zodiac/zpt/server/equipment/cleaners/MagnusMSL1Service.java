package zodiac.zpt.server.equipment.cleaners;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.equipment.cleaners.IMagnusMSL1Service;
import zodiac.zpt.shared.equipment.cleaners.MagnusMSL1TablePageData;

public class MagnusMSL1Service implements IMagnusMSL1Service {

	@Override
	public MagnusMSL1TablePageData getMagnusMSL1TableData(SearchFilter filter) {
		MagnusMSL1TablePageData pageData = new MagnusMSL1TablePageData();
		// TODO [Matt.Gagliano] fill pageData.
		return pageData;
	}
}
