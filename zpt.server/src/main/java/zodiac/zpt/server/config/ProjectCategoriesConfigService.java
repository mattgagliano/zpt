package zodiac.zpt.server.config;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.config.IProjectCategoriesConfigService;
import zodiac.zpt.shared.config.ProjectCategoriesConfigTablePageData;

public class ProjectCategoriesConfigService implements IProjectCategoriesConfigService {

	@Override
	public ProjectCategoriesConfigTablePageData getProjectCategoriesConfigTableData(SearchFilter filter) {
		ProjectCategoriesConfigTablePageData pageData = new ProjectCategoriesConfigTablePageData();
		// TODO [gagli] fill pageData.
		return pageData;
	}
}
