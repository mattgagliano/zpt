package zodiac.zpt.client.testsites;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;

/**
 * <h3>{@link TestSitesOutline}</h3>
 *
 * @author gagli
 */
@Order(1000)
public class TestSitesOutline extends AbstractOutline {

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		pageList.add(new TestSitesTablePage());
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("TestSites");
	}
}
