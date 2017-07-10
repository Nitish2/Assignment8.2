package FinalClass;
/**
 *  The use of final keyword with class.
 * @author Hp
 *
 */

//Creating class multiplication and declaring it with final keyword 
// As we declaring the class with final keyword , we cannot extends the class .
public final class Multiplication { 
	int a = 8; // Assigning values to  integer variables .
	int b = 6;
	int c = 5;
	int d = a * (b * c);  // Multiplying the 3 variables 

	public static void main(String[] args) {
		Multiplication mul = new Multiplication(); // Creating class object 
		System.out.println(" Multiplication of a X(b X c) is:"  + mul.d); // Printing the result

	}

}
