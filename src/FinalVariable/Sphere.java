package FinalVariable;

/**
 * The use of final keyword with variable.
 * 
 * @author Hp
 *
 */

public final class Sphere { // Creating class

	int r = 7;
	final double pi = 3.14;
	/**
	 * As we declaring the variable with final keyword , we cannot change the
	 * value of variable .
	 **/
	double area = 4 * pi * r * r; // Area of sphere

	public static void main(String[] args) {
		Sphere sp = new Sphere(); // Creating Object
		System.out.println("Area of sphere:" + sp.area); // Printing the result

	}

}
