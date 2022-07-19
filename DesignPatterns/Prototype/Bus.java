public class Bus extends Vehicle{

	private int numberOfSeats;
	public String getnumberOfSeats(){
		return numberOfSeats;
	}
	
	public void setnumberOfSeats(String numberOfSeats){
			this.numberOfSeats = numberOfSeats;
	}
	
	public String toString(){
		return "numberOfSeats is "+ numberOfSeats;
	}
}