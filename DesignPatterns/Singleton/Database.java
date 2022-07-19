public class Database{

	private static volatile Database db;
	
	private Database(){
		if(db != null){
			throw new RuntimeException("please use db method");
		}
	}
	public static Database getDBManager(){
		if (db == null){
			
			synchronized (Database.class){
				if(db==null){
					db = new Database();
				}
			}
			
		}
		return db;
	}
}