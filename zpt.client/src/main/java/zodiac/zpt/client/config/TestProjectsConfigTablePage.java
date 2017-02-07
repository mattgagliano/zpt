package zodiac.zpt.client.config;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.config.TestProjectsConfigTablePage.Table;
import zodiac.zpt.shared.config.ITestProjectsConfigService;
import zodiac.zpt.shared.config.TestProjectsConfigTablePageData;

@Data(TestProjectsConfigTablePageData.class)
public class TestProjectsConfigTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("TestProjectsConfig");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(ITestProjectsConfigService.class).getTestProjectsConfigTableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
