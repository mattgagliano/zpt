package zodiac.zpt.server.config;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.config.IProjectFormsConfigService;
import zodiac.zpt.shared.config.ProjectFormsConfigTablePageData;

public class ProjectFormsConfigService implements IProjectFormsConfigService {

	@Override
	public ProjectFormsConfigTablePageData getProjectFormsConfigTableData(SearchFilter filter) {
		ProjectFormsConfigTablePageData pageData = new ProjectFormsConfigTablePageData();
		// TODO [gagli] fill pageData.
		return pageData;
	}
}
