package zodiac.zpt.client;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

import zodiac.zpt.client.config.ProjectCategoriesConfigTablePage;
import zodiac.zpt.client.config.ProjectFormsConfigNodePage;
import zodiac.zpt.client.config.ProjectPhasesConfigTablePage;
import zodiac.zpt.client.config.TestProjectsConfigTablePage;
import zodiac.zpt.client.config.TestSiteFormConfigTablePage;

public class ConfigOutline extends AbstractOutline {
	
	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		pageList.add(new TestSiteFormConfigTablePage());
		pageList.add(new ProjectCategoriesConfigTablePage());
		pageList.add(new TestProjectsConfigTablePage());
		pageList.add(new ProjectPhasesConfigTablePage());
		pageList.add(new ProjectFormsConfigNodePage());
	}
	
	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Configuration");
	}
}
