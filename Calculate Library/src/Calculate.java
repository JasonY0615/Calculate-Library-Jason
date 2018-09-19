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
	// return max of the double passed
	public static double max(double x, double y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}
	// return max from three doubles
	public static double max(double x, double y, double z) { 
		if (x>y && x>z) { 
			return x; 
		}
		else if(y>x && y>z){
			return y;
		}
		else {
			return z;
		}
	}
	// return min from passed two int
	public static int min(int x, int y) { 
		if (x<y) { 
			return x; 
		}
		else {
			return y; 
		}
	}
	// return round 2
	public static double round2(double x) {
		x = Math.round(x*100.0)/100.0;
		return x;
	}
	// exponent 
	
	public static double exponent(double x, int y) {
		double temp = x;
		for(int i = 1; i < y; i++ ) {
			x = x*temp;
		}
		return x;
	}
	
	public static int factorial(int x) {
		for(int i = x; i > 0; i--) {
			x = x*i;
		}
	}
	
	public static boolean isPrime(int x) {
		int [] y = new int[x];
		for(int i = 1; i <= x; i++) {
			if(isDivisible(x, i) == true) {
				y[i] = 1;
			}
			else {
				y[i] = 0;
			}
		}
		
		int sum=0;
		for(int i = 1; i < x; i++) {
			sum = sum + i;
		}
		
		if(sum == 2) {
			return true;
		}
		
		return false;
	}
	
	public static int gcf(int x, int y) {
		int min = min(x, y);
		int max = 0;
		for(int i = 1; i <= min; i++) {
			if(isDivisible(x, i) && isDivisible(y, i)) {
				if(i > max) {
					max = i;
				}
			}
		}

	return max;
	}
	
}
}
