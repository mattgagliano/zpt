package zodiac.zpt.shared.testsites;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.scout.rt.platform.exception.ProcessingException;
import org.eclipse.scout.rt.shared.services.lookup.ILookupRow;
import org.eclipse.scout.rt.shared.services.lookup.LocalLookupCall;
import org.eclipse.scout.rt.shared.services.lookup.LookupRow;

public class AssignedTechLookupCall extends LocalLookupCall<String> {
	
	private static final long serialVersionUID = 1L;
	 
	@Override
	protected List<? extends ILookupRow<String>> execCreateLookupRows() throws ProcessingException {
	    
		List<LookupRow<String>> rows = new ArrayList<LookupRow<String>>();
		
		rows.add(new LookupRow<String>("DesroySmith", "Desroy Smith"));
		rows.add(new LookupRow<String>("MattGagliano", "Matt Gagliano"));
		rows.add(new LookupRow<String>("MattWeening", "Matt Weening"));
		rows.add(new LookupRow<String>("RonLarson", "Ron Larson"));
		
		return rows;
	}
}
