package com.bayamp.training.calc;

public class General {
	
	public static int asciiName(int character){
	
	int asciiName = character;
	System.out.println(" I am in ASCII mehtod");
	System.out.println(" i want to know the value of A" +" and the answer is " +  character);
	return asciiName;
	}
	
	public static double squareRoot(int inputNumber){
		
	double result = Math.sqrt(inputNumber);
	System.out.println ("I am calculating the squareRoot"+ result );
		
	return result;	
		
	}
	
	public static int calculateAverage(int noOfStudents, int marksOfStudents1, int marksOfStudents2 , int marksOfStudents3){
		
	int averageTotal =  (marksOfStudents1 + marksOfStudents2 + marksOfStudents3 / noOfStudents);
	
	System.out.println ( " I am in average method");
	System.out.println ( " This is average of marks of students in the the class is  " + averageTotal );
	
	
	return averageTotal;
		
	}
	
	public static int primeNumbers(int listOfNumbers ){
	
	int numbers = listOfNumbers;
	
	System.out.println(" I would like to know the prime numbers for the list of numbers" + numbers);
		
	return numbers;
	
	
	}
	
	public static void main(String args []){
		
		int character = 'e';
		
	    asciiName(character);
		
		int inputNumber = 36;
		squareRoot( inputNumber);
				
			
		int i = 1;
		int n = 50;
		
		while( ++i < --n);
		System.out.println("Midpoint is " + i);
		

	}
	
	}

