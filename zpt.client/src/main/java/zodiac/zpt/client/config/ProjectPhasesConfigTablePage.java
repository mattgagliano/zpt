package zodiac.zpt.client.config;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.config.ProjectPhasesConfigTablePage.Table;
import zodiac.zpt.shared.config.IProjectPhasesConfigService;
import zodiac.zpt.shared.config.ProjectPhasesConfigTablePageData;

@Data(ProjectPhasesConfigTablePageData.class)
public class ProjectPhasesConfigTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("ProjectPhasesConfig");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IProjectPhasesConfigService.class).getProjectPhasesConfigTableData(filter));
	}

	public class Table extends AbstractTable {
		
		//hierarchial tree display with category name, parent category
		//no form - add, delete menus/edit in fields - live update database table
		
	}
}
