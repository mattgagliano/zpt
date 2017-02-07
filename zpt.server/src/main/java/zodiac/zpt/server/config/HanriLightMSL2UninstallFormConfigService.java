package zodiac.zpt.server.config;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.config.HanriLightMSL2UninstallFormConfigTablePageData;
import zodiac.zpt.shared.config.IHanriLightMSL2UninstallFormConfigService;

public class HanriLightMSL2UninstallFormConfigService implements IHanriLightMSL2UninstallFormConfigService {

	@Override
	public HanriLightMSL2UninstallFormConfigTablePageData getHanriLightMSL2UninstallFormConfigTableData(
			SearchFilter filter) {
		HanriLightMSL2UninstallFormConfigTablePageData pageData = new HanriLightMSL2UninstallFormConfigTablePageData();
		// TODO [gagli] fill pageData.
		return pageData;
	}
}
