/* contains various methods that do much math calculations 
 * @author Jason Yang
 * @version September 6, 2018
 */
public class Calculate {
	// return the square of an integer        
	public static int square(int number) {
		return number * number; 
	}
	// return the cube of an integer 
	public static int cube(int number) { 
		return number * number * number; 
	}
	// return the average of two doubles 
	public static double average(double num1, double num2) {
		return (num1 + num2)/2; 
	}
	// return degrees(double) of the input radians(double)
	public static double toDegree(double radians) {
		return radians * 180 / 3.1429;
	}
	// return radians(double) of the input degrees(double)
	public static double toRadians(double degrees) {
		return degrees * 3.14159 / 180;		
	}
	// return discriminant(double) from three doubles a,b,c
	public static double discriminant(double a, double b, double c) {
		return b * b - 4 * b * c;
	}
	// return Improper Fraction(String) when input three mixed numbers(int)
	public static String toImproperfrac(int wholenumber, int numerator, int denominator) {
		int fraction = denominator * wholenumber + numerator; 
		return fraction + "/" + denominator; 
	}
}