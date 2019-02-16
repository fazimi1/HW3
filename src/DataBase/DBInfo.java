package DataBase;//singleton

public class DBInfo {
private DBInfo() {}

		public static DBInfo getInstance() {
			DBInfo dbLicense = new DBInfo();
			return dbLicense;
		}
	
}
