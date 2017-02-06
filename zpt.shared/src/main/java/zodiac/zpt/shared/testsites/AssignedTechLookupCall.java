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
		
		rows.add(new LookupRow<String>("Desroy Smith", "Desroy Smith"));
		rows.add(new LookupRow<String>("Matt Gagliano", "Matt Gagliano"));
		rows.add(new LookupRow<String>("Matt Weening", "Matt Weening"));
		rows.add(new LookupRow<String>("Ron Larson", "Ron Larson"));
		
		return rows;
	}
}
