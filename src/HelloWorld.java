import java.math.BigDecimal;
import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(40); 
		car.setDriver("seated"); 
		car.setDoor("closed");
		System.out.println(car.carIsRunning());
	}
}
