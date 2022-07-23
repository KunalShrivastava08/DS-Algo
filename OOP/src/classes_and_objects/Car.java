package classes_and_objects;

public class Car extends Vehicle{
	
	  int id;
	  Car() {
		  super(0,0);
		    System.out.print("Car ");
		    }
	    
	}

	class Main {
	    public static void main(String args[]) {
	    Car c = new Car();
	    }        
}