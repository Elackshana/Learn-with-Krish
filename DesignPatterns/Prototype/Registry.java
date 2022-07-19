public class Registry{
	private Map<VehicleType, Vehicle> vehicles = new HashMap<>();
	
	public Registry(){
		this.initialize();
	}
	
	public Vehicle getVehicle(VehicleType vehicleType){
		Vehicle vehicle= null;
		try{
			vehicle = (Vehicle) vehicles.get(vehicleType).clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return vehicle;
	}
	
	private void initialize(){
		Car car = new Car();
		car.settype("Mini");
		car.setfuelType("Gasoline");
		car.setengineCapacity(2000);
		
		Bus bus = new Bus();
		bus.setnumberOfSeats(23);
		bus.setfuelType("Diesal");
		bus.setengineCapacity(2000);
		
		vehicles.put(VehicleType.CAR, car);
		vehicles.put(VehicleType.BUS, bus);
		
	}
	
}