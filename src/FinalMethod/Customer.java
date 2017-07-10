package FinalMethod;

/**
 * The use of final keyword with variable. 
 * NOTE : Constructors cannot be final.
 * Because constructors are not ordinary methods. Constructors are never
 * inherited, so there is no sense in declaring them final.
 * 
 * @author Hp
 */
class Customer { // Creating class

	String name = " Karan Aroa"; // Assigning value to String Variable
	int id = 34456; // Assigning value to integer value

	final void display() { // Declaring final method
		System.out.println("Customer name:" + name);
		System.out.println("Customer id:" + id);
	}

}
