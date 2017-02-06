package zodiac.zpt.client.equipment.heaters;

import java.util.List;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

import zodiac.zpt.shared.equipment.heaters.JXiASMETablePageData;

@Data(JXiASMETablePageData.class)
public class JXiASMENodePage extends AbstractPageWithNodes {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("JXiASME");
	}
	
	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		pageList.add(new JXiASMEESL2TablePage());
		pageList.add(new JXiASMEMSL1TablePage());
		pageList.add(new JXiASMEMSL2TablePage());
	}
	
	public class Table extends AbstractTable {
	}
}
