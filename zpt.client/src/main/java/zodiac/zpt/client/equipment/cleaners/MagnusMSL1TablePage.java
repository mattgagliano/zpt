package zodiac.zpt.client.equipment.cleaners;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.equipment.cleaners.MagnusMSL1TablePage.Table;
import zodiac.zpt.shared.equipment.cleaners.IMagnusMSL1Service;
import zodiac.zpt.shared.equipment.cleaners.MagnusMSL1TablePageData;

@Data(MagnusMSL1TablePageData.class)
public class MagnusMSL1TablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("MagnusMSL1");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IMagnusMSL1Service.class).getMagnusMSL1TableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
