package zodiac.zpt.server.equipment.lights;

import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.server.jdbc.SQL;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.server.sql.SQLs;
import zodiac.zpt.shared.equipment.lights.HanriLightTablePageData;
import zodiac.zpt.shared.equipment.lights.IHanriLightService;

public class HanriLightService implements IHanriLightService {

	@Override
	public HanriLightTablePageData getHanriLightTableData(SearchFilter filter) {
		HanriLightTablePageData pageData = new HanriLightTablePageData();
		
		String sql = SQLs.HANRILIGHT_PAGE_SELECT + SQLs.HANRILIGHT_PAGE_DATA_SELECT_INTO;
        SQL.selectInto(sql, new NVPair("page", pageData));
		
		return pageData;
	}
}
