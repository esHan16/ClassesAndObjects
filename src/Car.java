
public class Car {
	private String door;
	public String getDoor() {
		return door;
	}
	public String getEngine() {
		return engine;
	}
	public String getDriver() {
		return driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	private String engine;
	private String driver;
	private int speed;
	
	public String carIsRunning() {
		if(door.equals("closed") && driver.equals("seated") && speed > 0) {
			return "Car is running";
		}
		return "Car is not running";
	}
}
