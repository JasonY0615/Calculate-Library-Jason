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
	public static  double discriminant(double a, double b, double c) {
		return b * b - 4 * b * c;
	}
	// return Improper Fraction(String) when input three mixed numbers(int)
	public static String toImproperfrac(int wholenumber, int numerator, int denominator) {
		int fraction = denominator * wholenumber + numerator; 
		return fraction + "/" + denominator; 
	}
	//return mixed number(String) when input numerator and denominator
	public static String toMixedNum(int number, int demon) { 
		int wholeNum = number / demon; 
		int newNumber = number % demon; 
		return wholeNum + "_" + newNumber + "/" + demon;	
	}
	public static String foil(int a, int b, int c, int d, String x) {
		int f = a * c; 
		int o = a * d;
		int i = b * c; 
		int l = b * d; 
		int oi = o + i;
		return f + x + "^2" +  "+" + oi + x + "+" + 1;	
	}
	public static boolean isDivisibleBy(int a, int b) {
		if (b == 0) throw new IllegalArgumentException ("can't divided by factor of 0");
		if(a % b == 0) {
			return true;
		}else { 
			return false;
		}
	}
	public static double absValue(double a) {
		if(a < 0) {
			return a * -1;  
		}else {
			return a;
		}
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
	public static double round2(double a) {
		if(a>0) { 
			a += 0.005;
		}else if(a == 0) { 
			a = 0;
		}else { 
			a -= -0.005;
		}
		a *= 100;
		double b = (int)a; 
		b /= 100;
		return b;
	}
	// exponent 
	public static double exponent(double x, int y) {
		if (x<0) throw new IllegalArgumentException ("negative input");
		double temp = x;
		for(int i = 1; i < y; i++ ) {
			x = x*temp;
		}
		return x;
	}
	
	public static int factorial(int x) {
		if (x<0) throw new IllegalArgumentException ("negative input");
		for(int i = x; i > 0; i--) {
			x = x*i;
		}
		return x;
	}
	
	public static boolean isPrime(int x) {
		int [] y = new int[x];
		for(int i = 1; i <= x; i++) {
			if(isDivisibleBy(x, i) == true) {
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
			if(isDivisibleBy(x, i) && isDivisibleBy(y, i)) {
				if(i > max) {
					max = i;
				}
			}
		}

	return max;
	} 
	public static double sqrt(double d) {
		if (d<0) throw new IllegalArgumentException("cannot square root negative number");
		double t; 
		double squareRoot = d/2; 
		do {
			t = squareRoot; 
			squareRoot = (t + (d / t)) / 2; 
		}while ((t - squareRoot) != 0 ); 
		return squareRoot; 
	}
	public static String quadFrom(double a, double b, double c) {
		if (discriminant(a, b, c) < 0) { 
			return "no real roots"; 
		}else if(discriminant(a, b, c) == 0) {
			return round2(-1*b/(2*a))+"";
		}else {
			double result1 = (((-1*b) + sqrt(discriminant(a, b, c)))); 
			result1 = result1/(2*a);
			double result2 = (((-1*b) - sqrt(discriminant(a, b, c)))); 
			result2 = result2/(2*a);
			return round2(result1) + " and " + round2(result2);
		}
	} 
	
	
}

