package fracCalc;

import java.util.Scanner; 

public class FracCalc {

    public static void main(String[] args) {
    	Scanner UserInput = new Scanner(System.in);
    	System.out.print("Enter a fraction problem:  "); 
    	String userResponse = UserInput.nextLine(); 
    	
    	while(!userResponse.equals("quit")) { 
    		System.out.println(produceAnswer(userResponse)); 
    		System.out.println("Enter a fraction problem: "); 
    		userResponse = UserInput.nextLine(); 
    	}   
    	UserInput.close();                       
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
    	String operand1 = input.split(" ")[0];
    	String operator = input.split(" ")[1];
    	String operand2 = input.split(" ")[2]; 
        
    	int op1Whole = 0; 
    	int op1Num = 0; 
    	int op1Deno = 0; 
        if (operand1.indexOf("/") != -1){
        	op1Num = Integer.parseInt(operand1.substring(operand1.indexOf("_") + 1, operand1.indexOf("/")));
            op1Deno = Integer.parseInt(operand1.substring(operand1.indexOf("/") + 1, operand1.length()));
            if (operand1.indexOf("_") != -1){ 
              op1Whole = Integer.parseInt(operand1.substring(0, operand1.indexOf("_")));
              if(op1Whole <0){
            	  op1Num = (op1Whole * op1Deno) - op1Num;
              }
              else {
            	  op1Num = (op1Whole * op1Deno) + op1Num;
              }
            }
            else {
            	op1Whole = 0;             
        }
        }
            else {
            	op1Num = Integer.parseInt(operand1);
            	op1Deno = 1;
            }
    
        
    	int op2Whole = 0; 
    	int op2Num = 0; 
    	int op2Deno = 0; 
        if (operand2.indexOf("/") != -1){
            op2Num = Integer.parseInt(operand2.substring(operand2.indexOf("_") + 1, operand2.indexOf("/")));
            op2Deno = Integer.parseInt(operand2.substring(operand2.indexOf("/") + 1, operand2.length()));        	       	
        	if (operand2.indexOf("_") != -1){
            op2Whole = Integer.parseInt(operand2.substring(0, operand2.indexOf("_")));
            if(op2Whole <0) {
            	op2Num = (op2Whole * op2Deno) - op2Num;
            }
        	else{
        		op2Num = (op2Whole * op2Deno) + op2Num; 
        	}
        }
        	else {
        		op2Whole = 0; 
        	}       
          }
        else {
          	op2Num = Integer.parseInt(operand2);
          	op2Deno = 1;
        }


    	String answer = "0";

        if(operator.equals("+")) { 
        	answer = (Addition(op1Num, op1Deno, op2Num, op2Deno));  
        }
        else if(operator.equals("-")) { 
        	answer = (Subtraction(op1Num, op1Deno, op2Num, op2Deno)); 
        }
        else if(operator.equals("*")) { 
        	answer = (Mutiplication(op1Num, op1Deno, op2Num, op2Deno));
        }
        else if(operator.equals("/")) { 
        	answer = (Division(op1Num, op1Deno, op2Num, op2Deno)); 
        }
        
        return (answer); 
               
       //return "whole:" + op2Whole + " " + "numerator:" + op2Num + " " + "denominator:" + op2Deno;

        // TODO: Implement this function to produce the solution to the input*/
        
    }
     
	public static String Addition(int op1Num, int op1Deno, int op2Num, int op2Deno) { 
		
    	if(op1Deno == op2Deno) {
    		return (op1Num + op2Num) + "/" + op1Deno; 
    	}else { 
    		return ((op1Num*op2Deno) + (op2Num*op1Deno)) + "/" + op1Deno * op2Deno;
    	}
	}
 
    
    public static String Subtraction(int op1Num, int op1Deno, int op2Num, int op2Deno) { 

        if(op1Deno == op2Deno) {
        	return (op1Num - op2Num) + "/" + op1Deno; 
        }else { 
        	return ((op1Num*op2Deno) - (op2Num*op1Deno)) + "/" + op1Deno * op2Deno;
        }
    }
 
     
    public static String Mutiplication(int op1Num, int op1Deno, int op2Num, int op2Deno) { 

        	return((op1Num*op2Num) + "/" + (op1Deno*op2Deno)); 
    }
    
	public static String Division(int op1Num, int op1Deno, int op2Num, int op2Deno) { 

			return((op1Num*op2Deno) + "/" + (op1Deno*op2Num));
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
	public static int Gcd( int a, int b ) {
        if ( b == 0 )
            return a;
        else
            return Gcd( a, a%b );
    }
    
    
    
    
    
    
    
    
    
    
}


