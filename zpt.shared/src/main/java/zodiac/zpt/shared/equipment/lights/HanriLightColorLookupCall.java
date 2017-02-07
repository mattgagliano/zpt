package zodiac.zpt.shared.equipment.lights;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.scout.rt.platform.exception.ProcessingException;
import org.eclipse.scout.rt.shared.services.lookup.ILookupRow;
import org.eclipse.scout.rt.shared.services.lookup.LocalLookupCall;
import org.eclipse.scout.rt.shared.services.lookup.LookupRow;

public class HanriLightColorLookupCall extends LocalLookupCall<String> {
	
	private static final long serialVersionUID = 1L;
	 
	@Override
	protected List<? extends ILookupRow<String>> execCreateLookupRows() throws ProcessingException {
	    
		List<LookupRow<String>> rows = new ArrayList<LookupRow<String>>();
		
		rows.add(new LookupRow<String>("Alpine White", "Alpine White"));
		rows.add(new LookupRow<String>("Fast Color Splash", "Fast Color Splash"));
		rows.add(new LookupRow<String>("America The Beautiful", "America The Beautiful"));
		rows.add(new LookupRow<String>("Fat Tuesday", "Fat Tuesday"));
		
		return rows;
	}
}
