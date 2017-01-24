package zodiac.zpt.server.sql;

public class DatabaseTableClass {

	protected String tablename = new String();
	
	protected int num_columns;
	
	public DatabaseTableClass(String name, int size) {
		
		this.tablename = name;
		this.num_columns = size;
		
		//sqlstmt = "INSERT INTO ZPT_TABLES (tablename, tablesize) VALUES ('"+name+"', "+size+")";
		
		//SQL.insert(sqlstmt);
	}
	
	//public DatabaseTableClass(String name, int size, String parent) {}
}
