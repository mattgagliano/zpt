package zodiac.zpt.client.equipment;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;

import zodiac.zpt.client.equipment.lights.EquipLightsNodePage;

/**
 * <h3>{@link EquipmentOutline}</h3>
 *
 * @author gagli
 */
@Order(3000)
public class EquipmentOutline extends AbstractOutline {

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		pageList.add(new EquipLightsNodePage());
	}
	
	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Equipment");
	}
}
