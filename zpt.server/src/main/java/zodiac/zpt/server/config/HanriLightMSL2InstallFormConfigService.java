package zodiac.zpt.server.config;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.config.HanriLightMSL2InstallFormConfigTablePageData;
import zodiac.zpt.shared.config.IHanriLightMSL2InstallFormConfigService;

public class HanriLightMSL2InstallFormConfigService implements IHanriLightMSL2InstallFormConfigService {

	@Override
	public HanriLightMSL2InstallFormConfigTablePageData getHanriLightMSL2InstallFormConfigTableData(
			SearchFilter filter) {
		HanriLightMSL2InstallFormConfigTablePageData pageData = new HanriLightMSL2InstallFormConfigTablePageData();
		// TODO [gagli] fill pageData.
		return pageData;
	}
}
