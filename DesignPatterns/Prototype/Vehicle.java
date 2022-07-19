public abstract class Vehicle implements Cloneable{
	
	private String fuelType;
	private int engineCapacity;
	
	public String getfuelType(){
		return fuelType;
	}
	
	public void setfuelType(String fuelType){
			this.fuelType = fuelType;
	}
	
	public String getengineCapacity(){
		return engineCapacity;
	}
	
	public void setengineCapacity(int engineCapacity){
			this.engineCapacity = engineCapacity;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}