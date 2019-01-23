package fracCalc;

import java.util.Arrays;
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


    	int[] answer= {0,1};

        if(operator.equals("+")) { 
        	answer = (addition(op1Num, op1Deno, op2Num, op2Deno));  
        }
        else if(operator.equals("-")) { 
        	answer = (subtraction(op1Num, op1Deno, op2Num, op2Deno)); 
        }
        else if(operator.equals("*")) { 
        	answer = (mutiplication(op1Num, op1Deno, op2Num, op2Deno));
        }
        else if(operator.equals("/")) { 
        	answer = (Division(op1Num, op1Deno, op2Num, op2Deno)); 
        }
        
        //System.out.println(answer[0] + "/" + answer[1]);
        //tomixednum answer
         return (toMixedNum(reducedNum(answer))); 
               
       //return "whole:" + op2Whole + " " + "numerator:" + op2Num + " " + "denominator:" + op2Deno;

        // TODO: Implement this function to produce the solution to the input*/
        
    }
     
	public static int[] addition(int op1Num, int op1Deno, int op2Num, int op2Deno) { 
		int[] answer= {0,1};
    	if(op1Deno == op2Deno) {
    		answer[0]= op1Num + op2Num;
    		answer[1]= op1Deno;
    		//	return (op1Num + op2Num) + "/" + op1Deno; 
    	}else { 
    		answer[0]= (op1Num*op2Deno) + (op2Num*op1Deno);
    		answer[1]= op1Deno * op2Deno;
    		//	return ((op1Num*op2Deno) + (op2Num*op1Deno)) + "/" + op1Deno * op2Deno;
    	}
    	return answer;
	}
 
    
    public static int[] subtraction(int op1Num, int op1Deno, int op2Num, int op2Deno) { 
    	int[] answer= {0,1};
        if(op1Deno == op2Deno) {
        	answer[0]= op1Num - op2Num;
    		answer[1]= op1Deno;
        	 
        }else { 
        	answer[0]= (op1Num*op2Deno) - (op2Num*op1Deno);
    		answer[1]= op1Deno * op2Deno;
        	//return ((op1Num*op2Deno) - (op2Num*op1Deno)) + "/" + op1Deno * op2Deno;
        }
        return answer; 
    }
 
     
    public static int[] mutiplication(int op1Num, int op1Deno, int op2Num, int op2Deno) { 
    	int[] answer= {0,1}; 
    	answer[0] = op1Num * op2Num;
    	answer[1] = op1Deno * op2Deno;
        return answer; 
    }
    
	public static int[] Division(int op1Num, int op1Deno, int op2Num, int op2Deno) { 
    	int[] answer= {0,1};
    	answer[0] =  (op1Num*op2Deno); 
    	answer[1] = (op1Deno*op2Num); 
    	return answer; 
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
	public static int gcf(int a, int b) { // a & b are the numerators and denominators, b is the initial denominator 
	if( b == 0) { //checks if b = 0
		return a; // if b = 0 then returns the value of a
		}
	else { // if b is not equal to zero
		return gcf(b, a%b); //then does gcf again, with 'b' as the 'a'-input and the remainder of a/b as the 'b'-input
		}
	} 

	
	public static int[] reducedNum (int[] answer) { 
		 int[] temp={0,1};
		//use gcf to reduce
		temp[0] = answer[0] / gcf(answer[0],answer[1]); 
		temp[1] = answer[1] / gcf(answer[0],answer[1]); 
		return temp;
	}
	//return mixed number(String) when input numerator and denominator
		public static String toMixedNum(int[] answer) { 
			int wholenum= answer[0] / answer[1]; // whole
			int remainder= answer[0] % answer[1]; // remainder
			int denominator = answer[1]
;			
			String answerStr="";
			if (wholenum != 0) {   
				if (remainder != 0) {
					if (wholenum < 0) {
						remainder = remainder * -1; 
						answerStr = wholenum + "_" + remainder + "/" + denominator; 
					}
					if (remainder < 0 && denominator <0) {
						remainder = remainder * -1; 
						denominator = denominator * -1; 
						answerStr = wholenum + "_" + remainder + "/" + denominator;
					}
					else { 
					answerStr = wholenum + "_" + remainder + "/" + denominator ;
				}
				}// if both num and deno are nega then return posi
				else { 
					if(denominator == 1) {
						answerStr = Integer.toString(wholenum);
					}
					else if (denominator == -1) {
						wholenum = wholenum * -1; 
						answerStr = Integer.toString(wholenum);
					}
					                                                          
				}
			}
			else { 
				if (remainder != 0) {
					answerStr = remainder + "/" + denominator; 
				}
				else {
					answerStr = "0"; 
				}
			}
				
			return answerStr;	
		}
	}

// I have to deal with the mutiplication when it is = 0;
