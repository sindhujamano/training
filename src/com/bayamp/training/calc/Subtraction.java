package com.bayamp.training.calc;

public class Subtraction {
	
	
	public static long subtractMyMonthlySalary( int salary, int rent , int grocery, int carLoan ){
		
	long balanceCashInHand = salary - (rent + grocery+ carLoan);
		
	return balanceCashInHand;
		
	}
	
    public double subtractNoOfStudentsInTheClass( double totalNoOfStudents, double noOfStudentsAbsent){ 
	
	double noOfStudentsPresent = totalNoOfStudents - noOfStudentsAbsent;
	
    return noOfStudentsPresent;
		
    }
	}
