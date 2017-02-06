package zodiac.zpt.client.equipment.heaters;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.equipment.heaters.JXiASMEESL2TablePage.Table;
import zodiac.zpt.shared.equipment.heaters.IJXiASMEESL2Service;
import zodiac.zpt.shared.equipment.heaters.JXiASMEESL2TablePageData;

@Data(JXiASMEESL2TablePageData.class)
public class JXiASMEESL2TablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("JXiASMEESL2");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IJXiASMEESL2Service.class).getJXiASMEESL2TableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
