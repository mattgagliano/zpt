package zodiac.zpt.server.config;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.config.HanriLightMSL2InspectionFormConfigTablePageData;
import zodiac.zpt.shared.config.IHanriLightMSL2InspectionFormConfigService;

public class HanriLightMSL2InspectionFormConfigService implements IHanriLightMSL2InspectionFormConfigService {

	@Override
	public HanriLightMSL2InspectionFormConfigTablePageData getHanriLightMSL2InspectionFormConfigTableData(
			SearchFilter filter) {
		HanriLightMSL2InspectionFormConfigTablePageData pageData = new HanriLightMSL2InspectionFormConfigTablePageData();
		// TODO [gagli] fill pageData.
		return pageData;
	}
}
