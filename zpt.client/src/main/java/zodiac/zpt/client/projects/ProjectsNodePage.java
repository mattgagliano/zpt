package zodiac.zpt.client.projects;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

import zodiac.zpt.client.equipment.cleaners.EquipCleanersNodePage;
import zodiac.zpt.client.equipment.heaters.EquipHeatersNodePage;
import zodiac.zpt.client.equipment.lights.EquipLightsNodePage;

public class ProjectsNodePage extends AbstractPageWithNodes {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Projects");
	}

	@Override
	protected boolean getConfiguredExpanded() {
		return true;
	}
	
	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		pageList.add(new EquipCleanersNodePage());
		pageList.add(new EquipHeatersNodePage());
		pageList.add(new EquipLightsNodePage());
	}
}
