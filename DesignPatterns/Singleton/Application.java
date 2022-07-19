public class Application{
	
	public static void main(String[] args){
		
		Database db = Database.getDBManager();
		System.out.println(db);
		
		Database db1 = Database.getDBManager();
		System.out.println(db1);
	}
}