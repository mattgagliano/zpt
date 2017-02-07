package zodiac.zpt.client.config;

import java.util.List;
import java.util.Set;

import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TreeMenuType;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.shared.TEXTS;

public class ProjectFormsConfigNodePage extends AbstractPageWithNodes {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("ProjectFormsConfig");
	}



	@Order(1000)
	public class NewMenu extends AbstractMenu {
		@Override
		protected String getConfiguredText() {
			return TEXTS.get("New");
		}

		@Override
		protected Set<? extends IMenuType> getConfiguredMenuTypes() {
			return CollectionUtility.hashSet(TreeMenuType.SingleSelection, TreeMenuType.MultiSelection);
		}

		@Override
		protected void execAction() {
		}
	}



	@Order(2000)
	public class EditMenu extends AbstractMenu {
		@Override
		protected String getConfiguredText() {
			return TEXTS.get("Edit");
		}

		@Override
		protected Set<? extends IMenuType> getConfiguredMenuTypes() {
			return CollectionUtility.hashSet(TreeMenuType.SingleSelection, TreeMenuType.MultiSelection);
		}

		@Override
		protected void execAction() {
		}
	}



	@Order(3000)
	public class DeleteMenu extends AbstractMenu {
		@Override
		protected String getConfiguredText() {
			return TEXTS.get("Delete");
		}

		@Override
		protected Set<? extends IMenuType> getConfiguredMenuTypes() {
			return CollectionUtility.hashSet(TreeMenuType.SingleSelection, TreeMenuType.MultiSelection);
		}

		@Override
		protected void execAction() {
		}
	}
	
	

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		pageList.add(new HanriLightMSL2InstallFormConfigTablePage());
		pageList.add(new HanriLightMSL2InspectionFormConfigTablePage());
		pageList.add(new HanriLightMSL2UninstallFormConfigTablePage());
	}
}
