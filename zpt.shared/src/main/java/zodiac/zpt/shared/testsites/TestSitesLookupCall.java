package zodiac.zpt.shared.testsites;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.scout.rt.platform.exception.ProcessingException;
import org.eclipse.scout.rt.shared.services.lookup.ILookupRow;
import org.eclipse.scout.rt.shared.services.lookup.LocalLookupCall;
import org.eclipse.scout.rt.shared.services.lookup.LookupRow;

public class TestSitesLookupCall extends LocalLookupCall<String> {
	
	private static final long serialVersionUID = 1L;
	 
	@Override
	protected List<? extends ILookupRow<String>> execCreateLookupRows() throws ProcessingException {
	    
		List<LookupRow<String>> rows = new ArrayList<LookupRow<String>>();
		
		rows.add(new LookupRow<String>("Gary Hough", "Gary Hough"));
		rows.add(new LookupRow<String>("James Hartman", "James Hartman"));
		rows.add(new LookupRow<String>("Michael Javier", "Michael Javier"));
		rows.add(new LookupRow<String>("Dan Lukasik", "Dan Lukasik"));
		
		return rows;
	}
}