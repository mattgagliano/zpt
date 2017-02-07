package zodiac.zpt.client.config;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.config.HanriLightMSL2InstallFormConfigTablePage.Table;
import zodiac.zpt.shared.config.HanriLightMSL2InstallFormConfigTablePageData;
import zodiac.zpt.shared.config.IHanriLightMSL2InstallFormConfigService;

@Data(HanriLightMSL2InstallFormConfigTablePageData.class)
public class HanriLightMSL2InstallFormConfigTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return "Hanri MSL2 Install Form Config";
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IHanriLightMSL2InstallFormConfigService.class)
				.getHanriLightMSL2InstallFormConfigTableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
