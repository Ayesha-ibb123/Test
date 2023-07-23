package test;

public class Vehicle {  //Parent Class
	public static void main(String[] args) {
		System.out.println("Inheritance");
	}
	public void test()
	{}

}
class Child extends Vehicle {
	// Child class inherits the test() method from Vehicle class

}

class Ayeshaa{
	public static void main(String[] args) {
		Child child = new Child();
		child.test(); // Calls the test() method of the Child class

		Vehicle v1 = new Vehicle();
		v1.test(); // Calls the test() method of the Vehicle class
		System.out.println("Inheritance example");
	}
}



