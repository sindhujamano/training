package com.bayamp.training.calc;

public class Practice {
	
	
	public static  int compareNumbers(int num1,int num2){
		

		if(num1>num2){
			System.out.println(" The number is greater than number2");
			return 1;
		}else if (num1<num2) {
		     System.out.println(" Either number1 is less than number2 or the both numbers are equals");
		    return 0;
		} else if (num1 ==num2){
			System.out.println("Both the numbers are equals");
		     return 0;
		     
		}else {
			System.out.println(" Dont know why need this ");
			
		}
		
		return  1;
		
	
	}
}