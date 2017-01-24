package zodiac.zpt.server.sql;

import java.util.ArrayList;
import java.util.List;

public class SQLm {
	
	protected static String Select_Table_Names() {
		return "SELECT   UPPER(tablename) "
		      + "FROM     sys.systables "
		      + "INTO     :result";
	}
	
	protected static void Create_ZPT_TABLES() {
		
		//create all database tables
		List<String> tablenames = new ArrayList<String>();
		List<Integer> tablesizes = new ArrayList<Integer>();
		
		tablenames.add("table0");
		tablesizes.add(70);
		
		tablenames.add("table1");
		tablesizes.add(71);
		
		tablenames.add("table2");
		tablesizes.add(72);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(tablenames);
		System.out.println(tablesizes);
		
		/*StringArrayHolder tabledata = new StringArrayHolder();
		SQL.selectInto(Select_Table_Names(), new NVPair("", tabledata));
		
		System.out.println(CollectionUtility.hashSet(tables.getValue()));*/
	}
	
	protected static String Create_Table(String tableName) {
		
		return "CREATE TABLE " + tableName 
				+ "         (siteid VARCHAR(64) NOT NULL CONSTRAINT TESTSITES_PK PRIMARY KEY, "
			      + "          lastname VARCHAR(64), "
			      + "          firstname VARCHAR(64), "
			      + "          street VARCHAR(64), "
			      + "          city VARCHAR(64), "
			      + "          state VARCHAR(64), "
			      + "          zip VARCHAR(64), "
			      + "          email VARCHAR(64), "
			      + "          phone VARCHAR(64), "
			      + "          assignedtech VARCHAR(64), "
			      + "          ndaissuedate TIMESTAMP, "
			      + "          poolpicurl VARCHAR(128), "
			      + "          equippicurl VARCHAR(128), "
			      + "          poollayout VARCHAR(64), "
			      + "          poolvolume VARCHAR(64), "
			      + "          poolshape VARCHAR(64), "
			      + "          pooldimensions VARCHAR(64), "
			      + "          poolfinish VARCHAR(64), "
			      + "          marketingpool VARCHAR(64), "
			      + "          eqindooroutdoor VARCHAR(64), "
			      + "          eqabovebelowwater VARCHAR(64), "
			      + "          servicecontact VARCHAR(64), "
			      + "          poolnotes VARCHAR(64), "
			      + "          hasautomation VARCHAR(64), "
			      + "          automationtype VARCHAR(64), "
			      + "          hasiaqualink VARCHAR(64), "
			      + "          iaqualinkdevicenumber VARCHAR(64), "
			      + "          automationnotes VARCHAR(64), "
			      + "          hasinfloors VARCHAR(64), "
			      + "          pressuretype VARCHAR(64), "
			      + "          suctiontype VARCHAR(64), "
			      + "          pressureref VARCHAR(64), "
			      + "          roboticref VARCHAR(64), "
			      + "          suctionref VARCHAR(64), "
			      + "          cleanernotes VARCHAR(64), "
			      + "          hassolar VARCHAR(64), "
			      + "          gastype VARCHAR(64), "
			      + "          heaternotes VARCHAR(64), "
			      + "          sitenotes VARCHAR(64) "
			      + "         )";
	}
}
