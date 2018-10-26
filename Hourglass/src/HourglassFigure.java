
public class HourglassFigure {
	int size = 10;
	public static void main (String [] args) { 
		base(10); 
		System.out.println();
		top();
		System.out.println();
		//middle();
	//	bottom();
		base(10);
	}
	public static void base(int numquotes) {
		System.out.print( "|\"\"\"\"\"\"\"\"\"\"|" );
	
	}
	public static void repeat (String str, int num) {
		for (int i = 1; i <= num; i ++) {
				System.out.print(str);
			}
	}
    public static void top ( ) {
    	
    	
    	
    	
    	for (int i = 1; i <= 4; i ++) { //print four rows    		
    		for (int a = 1; a <= i; a ++) { //print spaces
    			System.out.print(" ");
    		}
    		System.out.print("\\");  //print \
    		for (int j = 1; j <= (-2 * i + 10) ; j ++) { //print colons
    			System.out.print(":");
    		}
    		
    		System.out.println("/");//print /
    	}
    	
    } 
}
    

