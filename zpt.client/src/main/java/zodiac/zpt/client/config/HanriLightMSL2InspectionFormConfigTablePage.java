package zodiac.zpt.client.config;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.config.HanriLightMSL2InspectionFormConfigTablePage.Table;
import zodiac.zpt.shared.config.HanriLightMSL2InspectionFormConfigTablePageData;
import zodiac.zpt.shared.config.IHanriLightMSL2InspectionFormConfigService;

@Data(HanriLightMSL2InspectionFormConfigTablePageData.class)
public class HanriLightMSL2InspectionFormConfigTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("HanriMSL2InspectionFormConfig");
	}
	
	

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IHanriLightMSL2InspectionFormConfigService.class)
				.getHanriLightMSL2InspectionFormConfigTableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
