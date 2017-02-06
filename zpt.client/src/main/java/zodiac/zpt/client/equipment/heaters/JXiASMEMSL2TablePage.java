package zodiac.zpt.client.equipment.heaters;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.equipment.heaters.JXiASMEMSL2TablePage.Table;
import zodiac.zpt.shared.equipment.heaters.IJXiASMEMSL2Service;
import zodiac.zpt.shared.equipment.heaters.JXiASMEMSL2TablePageData;

@Data(JXiASMEMSL2TablePageData.class)
public class JXiASMEMSL2TablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("JXiASMEMSL2");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IJXiASMEMSL2Service.class).getJXiASMEMSL2TableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
