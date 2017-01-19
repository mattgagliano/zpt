package zodiac.zpt.shared.testsites;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.scout.rt.platform.exception.ProcessingException;
import org.eclipse.scout.rt.shared.services.lookup.ILookupRow;
import org.eclipse.scout.rt.shared.services.lookup.LocalLookupCall;
import org.eclipse.scout.rt.shared.services.lookup.LookupRow;

public class PoolFinishLookupCall extends LocalLookupCall<String> {

	private static final long serialVersionUID = 1L;
	 
	@Override
	protected List<? extends ILookupRow<String>> execCreateLookupRows() throws ProcessingException {
	    
		List<LookupRow<String>> rows = new ArrayList<LookupRow<String>>();
		
		rows.add(new LookupRow<String>("ExposedAggregate", "Exposed Aggregate"));
		rows.add(new LookupRow<String>("Fiberglass", "Fiberglass"));
		rows.add(new LookupRow<String>("Paint", "Paint"));
		rows.add(new LookupRow<String>("Plaster", "Plaster"));
		rows.add(new LookupRow<String>("PolishedAggregate", "Polished Aggregate"));
		rows.add(new LookupRow<String>("Tile", "Tile"));
		rows.add(new LookupRow<String>("Vinyl", "Vinyl"));
		
		return rows;
	}
}
