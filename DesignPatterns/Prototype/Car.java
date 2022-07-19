public class Car extends Vehicle{

	private String type;
	public String gettype(){
		return type;
	}
	
	public void settype(String type){
			this.type = type;
	}
	public String toString(){
		return "type is "+ type;
	}
}