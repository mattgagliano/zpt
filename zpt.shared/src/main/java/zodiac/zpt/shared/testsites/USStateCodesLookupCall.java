package zodiac.zpt.shared.testsites;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.scout.rt.platform.exception.ProcessingException;
import org.eclipse.scout.rt.shared.services.lookup.ILookupRow;
import org.eclipse.scout.rt.shared.services.lookup.LocalLookupCall;
import org.eclipse.scout.rt.shared.services.lookup.LookupRow;

public class USStateCodesLookupCall extends LocalLookupCall<String> {
	
	private static final long serialVersionUID = 1L;
	 
	@Override
	protected List<? extends ILookupRow<String>> execCreateLookupRows() throws ProcessingException {
	    
		List<LookupRow<String>> rows = new ArrayList<LookupRow<String>>();
		
		rows.add(new LookupRow<String>("AL", "AL"));
		rows.add(new LookupRow<String>("AK", "AK"));
		rows.add(new LookupRow<String>("AZ", "AZ"));
		rows.add(new LookupRow<String>("AR", "AR"));
		rows.add(new LookupRow<String>("CA", "CA"));
		rows.add(new LookupRow<String>("CO", "CO"));
		rows.add(new LookupRow<String>("CT", "CT"));
		rows.add(new LookupRow<String>("DE", "DE"));
		rows.add(new LookupRow<String>("FL", "FL"));
		rows.add(new LookupRow<String>("GA", "GA"));
		rows.add(new LookupRow<String>("HI", "HI"));
		rows.add(new LookupRow<String>("ID", "ID"));
		rows.add(new LookupRow<String>("IL", "IL"));
		rows.add(new LookupRow<String>("IN", "IN"));
		rows.add(new LookupRow<String>("IA", "IA"));
		rows.add(new LookupRow<String>("KS", "KS"));
		rows.add(new LookupRow<String>("KY", "KY"));
		rows.add(new LookupRow<String>("LA", "LA"));
		rows.add(new LookupRow<String>("ME", "ME"));
		rows.add(new LookupRow<String>("MD", "MD"));
		rows.add(new LookupRow<String>("MA", "MA"));
		rows.add(new LookupRow<String>("MI", "MI"));
		rows.add(new LookupRow<String>("MN", "MN"));
		rows.add(new LookupRow<String>("MS", "MS"));
		rows.add(new LookupRow<String>("MO", "MO"));
		rows.add(new LookupRow<String>("MT", "MT"));
		rows.add(new LookupRow<String>("NE", "NE"));
		rows.add(new LookupRow<String>("NV", "NV"));
		rows.add(new LookupRow<String>("NH", "NH"));
		rows.add(new LookupRow<String>("NJ", "NJ"));
		rows.add(new LookupRow<String>("NM", "NM"));
		rows.add(new LookupRow<String>("NY", "NY"));
		rows.add(new LookupRow<String>("NC", "NC"));
		rows.add(new LookupRow<String>("ND", "ND"));
		rows.add(new LookupRow<String>("OH", "OH"));
		rows.add(new LookupRow<String>("OK", "OK"));
		rows.add(new LookupRow<String>("OR", "OR"));
		rows.add(new LookupRow<String>("PA", "PA"));
		rows.add(new LookupRow<String>("RI", "RI"));
		rows.add(new LookupRow<String>("SC", "SC"));
		rows.add(new LookupRow<String>("SD", "SD"));
		rows.add(new LookupRow<String>("TN", "TN"));
		rows.add(new LookupRow<String>("TX", "TX"));
		rows.add(new LookupRow<String>("UT", "UT"));
		rows.add(new LookupRow<String>("VT", "VT"));
		rows.add(new LookupRow<String>("VA", "VA"));
		rows.add(new LookupRow<String>("WA", "WA"));
		rows.add(new LookupRow<String>("WV", "WV"));
		rows.add(new LookupRow<String>("WI", "WI"));
		rows.add(new LookupRow<String>("WY", "WY"));
		
		return rows;
	}
}
