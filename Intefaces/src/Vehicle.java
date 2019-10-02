public class Vehicle extends Crashable implements Drivable {
	
	int numOfWheels = 4;
	
	double theSpeed = 0;
	
	int carStrength = 0;
	
	public int getWheels(){
		
		return this.numOfWheels;
	}
	
	
	public void setWheels(int NumWheels) {
	}
	
	public double getSpeed() {
	
	return this.theSpeed;
	
	}
	
	public void SetSpeed(double speed) {
		
		this.theSpeed = speed;
	}
	
	public Vehicle( int wheels, double speed){
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}


	public void setCarStrength(int CarStrength) {
		this.carStrength = CarStrength;
		
	}


	public int getCarStrength() {
		return this.carStrength;
	}


}
