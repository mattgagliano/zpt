package zodiac.zpt.client.config;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.config.TestSiteFormConfigTablePage.Table;
import zodiac.zpt.shared.config.ITestSiteFormConfigService;
import zodiac.zpt.shared.config.TestSiteFormConfigTablePageData;

@Data(TestSiteFormConfigTablePageData.class)
public class TestSiteFormConfigTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("TestSiteFormConfig");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(ITestSiteFormConfigService.class).getTestSiteFormConfigTableData(filter));
	}

	public class Table extends AbstractTable {
	}
}
