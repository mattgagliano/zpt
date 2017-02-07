package zodiac.zpt.client;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

import zodiac.zpt.client.projects.ProjectsNodePage;
import zodiac.zpt.client.testsites.TestSitesTablePage;

public class MainOutline extends AbstractOutline {
	
	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		pageList.add(new TestSitesTablePage());
		pageList.add(new ProjectsNodePage());
	}
	
	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("CloudZ");
	}
}
