package com.bridgelabz.assignment;

/**
 * @author Subhashree Naik
 *
 */
public class EmployeeWageCalculation {
	
	//Declaring constant
	final static int FULL_TIME=1;
	final static int PART_TIME=2;
	final static int WAGE_PER_HOUR=20;

	//Declaring variables
	static int working_hour=0;
	static int total_wage=0;
	static int totalhr=0;
    static int totalworkingdays=0;
	
	//This method compute total wage of employee using switchcase
	static void computeDailyWage() {
		while(totalhr<=100 && totalworkingdays<20) {
       	totalworkingdays++;

        int empType = (int) (Math.random() * 10) % 3;
        switch(empType) {
        case FULL_TIME:
	      {
		   working_hour=8;
		   break;
	       }
	       case PART_TIME:
	       {
		   working_hour=4;
		   break;
	
	       }
	       default:
	       {
		   working_hour=0;
		   break;
	       }
        }
        
        totalhr +=working_hour;
	      
}
		total_wage= totalhr * WAGE_PER_HOUR;
	    System.out.println("total empoyee wage  "+total_wage);
}
	

 public static void main(String[] args) {	
	     computeDailyWage();  	
	        
	    }
	}
	
