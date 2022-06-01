class Vehicle{
	String type;
	String colour;
	public Vehicle(String type, String colour) {
		this.type=type;
		this.colour=colour;
	}
	
}
class Car extends Vehicle{
	int wheel;
	int price;
	int average;
	
	public Car(String type, String colour, int wheel, int price, int average ) {
		super(type, colour);
		this.wheel=wheel;
		this.price=price;
		this.average=average;
	}
	
	public void display1() {
		System.out.println("The Type of Bus is:" +type + " " + "The Colour of Bus is:" +colour+ " "
	        +"The Wheels are:" + wheel + " " + "The Price is:" + price + " " + "The Average is:" + average);
}

class Bus extends Vehicle{
	int wheel;
	int price;
	int average;
	public Bus(String type, String colour, int wheel, int price, int average ) {
		super(type, colour);
		this.wheel=wheel;
		this.price=price;
		this.average=average;
	}
	
	
	void display() {
		System.out.println("The Type of Car is:" +type + " " + "The Colour of Car is:" +colour+ " " 
	          +"The Wheels are:" + wheel + " " + "The Price is:" + price + " " + "The Average is:" + average);
	}
	
	} 
}
public class Hierchical1 {
    public static void main(String args[]) {
		Car c=new Car("Suzuki","Red",4,70000,60);
		c.display1();
	}

}
