package zodiac.zpt.client.equipment.heaters;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

public class EquipHeatersNodePage extends AbstractPageWithNodes {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Heaters");
	}
	
	@Override
	protected boolean getConfiguredExpanded() {
		return true;
	}

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		pageList.add(new HiE2NodePage());
		pageList.add(new JXiASMENodePage());
	}
}
