
public class HourglassFigure {
	int size = 10;
	public static void main (String [] args) { 
		base(10); 
	}
	public static void base(int numquotes) {
		 "|" + repeat("\"", numquotes) + "|";
	}
	public static void repeat (String str, int num) {
		for (int i = 1; i <= num; i ++) {
				System.out.print(str);
			}
	}
    public static void main1 (String [] args ) {
    	
    }


