package zodiac.zpt.client.config;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.config.ProjectFormsConfigTablePage.Table;
import zodiac.zpt.shared.config.IProjectFormsConfigService;
import zodiac.zpt.shared.config.ProjectFormsConfigTablePageData;

@Data(ProjectFormsConfigTablePageData.class)
public class ProjectFormsConfigTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("ProjectFormsConfig");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IProjectFormsConfigService.class).getProjectFormsConfigTableData(filter));
	}

	public class Table extends AbstractTable {
		
		//table 
		//smartfield to select project, smartfield for phase, 
		//templated
	}
}
