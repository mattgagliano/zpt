package zodiac.zpt.client;

import java.util.List;

import org.eclipse.scout.rt.client.session.ClientSessionProvider;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.desktop.AbstractDesktop;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutlineViewButton;
import org.eclipse.scout.rt.client.ui.desktop.outline.IOutline;
import org.eclipse.scout.rt.client.ui.form.ScoutInfoForm;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.shared.TEXTS;

import zodiac.zpt.shared.Icons;

/**
 * <h3>{@link Desktop}</h3>
 *
 * @author gagli
 */
public class Desktop extends AbstractDesktop {
	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("CloudZ");
	}

	@Override
	protected String getConfiguredLogoId() {
		return Icons.AppLogo;
	}

	@Override
	protected List<Class<? extends IOutline>> getConfiguredOutlines() {
		return CollectionUtility.<Class<? extends IOutline>>arrayList(ConfigOutline.class,
				MainOutline.class);
	}

	@Override
	protected void execGuiAttached() {
		super.execGuiAttached();
		selectFirstVisibleOutline();
	}

	protected void selectFirstVisibleOutline() {
		for (IOutline outline : getAvailableOutlines()) {
			if (outline.isEnabled() && outline.isVisible()) {
				setOutline(outline);
				break;
			}
		}
	}

	@Order(1000)
	public class FileMenu extends AbstractMenu {

		@Override
		protected String getConfiguredText() {
			return TEXTS.get("User");
		}

		@Order(1000)
		public class ExitMenu extends AbstractMenu {

			@Override
			protected String getConfiguredText() {
				return TEXTS.get("Log Out");
			}

			@Override
			protected void execAction() {
				ClientSessionProvider.currentSession(ClientSession.class).stop();
			}
		}
	}

	@Order(3000)
	public class HelpMenu extends AbstractMenu {

		@Override
		protected String getConfiguredText() {
			return TEXTS.get("Help");
		}

		@Order(1000)
		public class AboutMenu extends AbstractMenu {

			@Override
			protected String getConfiguredText() {
				return TEXTS.get("About");
			}

			@Override
			protected void execAction() {
				ScoutInfoForm form = new ScoutInfoForm();
				form.startModify();
			}
		}
	}

	@Order(1000)
	public class MainOutlineViewButton extends AbstractOutlineViewButton {

		public MainOutlineViewButton() {
			this(MainOutline.class);
		}

		protected MainOutlineViewButton(Class<? extends MainOutline> outlineClass) {
			super(Desktop.this, outlineClass);
		}
		
		@Override
		protected DisplayStyle getConfiguredDisplayStyle() {
			return DisplayStyle.TAB;
		}
		
		@Override
		public String getIconId() {			
			return Icons.World;
		}
	}

	@Order(2000)
	public class ConfigOutlineViewButton extends AbstractOutlineViewButton {

		public ConfigOutlineViewButton() {
			this(ConfigOutline.class);
		}

		protected ConfigOutlineViewButton(Class<? extends ConfigOutline> outlineClass) {
			super(Desktop.this, outlineClass);
		}

		@Override
		protected DisplayStyle getConfiguredDisplayStyle() {
			return DisplayStyle.TAB;
		}
		
		@Override
		public String getIconId() {			
			return Icons.Gear;
		}
	}
}
