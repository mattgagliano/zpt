package zodiac.zpt.client.config;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.config.ProjectCategoriesConfigTablePage.Table;
import zodiac.zpt.shared.config.IProjectCategoriesConfigService;
import zodiac.zpt.shared.config.ProjectCategoriesConfigTablePageData;

@Data(ProjectCategoriesConfigTablePageData.class)
public class ProjectCategoriesConfigTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("ProjectCategoriesConfig");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IProjectCategoriesConfigService.class).getProjectCategoriesConfigTableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
