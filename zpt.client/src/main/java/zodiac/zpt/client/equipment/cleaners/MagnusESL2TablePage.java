package zodiac.zpt.client.equipment.cleaners;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.equipment.cleaners.MagnusESL2TablePage.Table;
import zodiac.zpt.shared.equipment.cleaners.IMagnusESL2Service;
import zodiac.zpt.shared.equipment.cleaners.MagnusESL2TablePageData;

@Data(MagnusESL2TablePageData.class)
public class MagnusESL2TablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("MagnusESL2");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IMagnusESL2Service.class).getMagnusESL2TableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
