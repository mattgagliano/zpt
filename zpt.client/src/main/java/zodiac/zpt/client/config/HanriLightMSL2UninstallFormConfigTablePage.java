package zodiac.zpt.client.config;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.config.HanriLightMSL2UninstallFormConfigTablePage.Table;
import zodiac.zpt.shared.config.HanriLightMSL2UninstallFormConfigTablePageData;
import zodiac.zpt.shared.config.IHanriLightMSL2UninstallFormConfigService;

@Data(HanriLightMSL2UninstallFormConfigTablePageData.class)
public class HanriLightMSL2UninstallFormConfigTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("HanriMSL2UninstallFormConfig");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IHanriLightMSL2UninstallFormConfigService.class)
				.getHanriLightMSL2UninstallFormConfigTableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
