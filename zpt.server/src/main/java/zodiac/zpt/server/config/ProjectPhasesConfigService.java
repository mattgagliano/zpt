package zodiac.zpt.server.config;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.config.IProjectPhasesConfigService;
import zodiac.zpt.shared.config.ProjectPhasesConfigTablePageData;

public class ProjectPhasesConfigService implements IProjectPhasesConfigService {

	@Override
	public ProjectPhasesConfigTablePageData getProjectPhasesConfigTableData(SearchFilter filter) {
		ProjectPhasesConfigTablePageData pageData = new ProjectPhasesConfigTablePageData();
		// TODO [gagli] fill pageData.
		return pageData;
	}
}
