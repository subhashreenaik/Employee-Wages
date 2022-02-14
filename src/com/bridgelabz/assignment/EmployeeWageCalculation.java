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
	final int FULL_DAY_HOUR=8;
	final int PART_TIME_HOUR=4;
	static int working_hour=0;
	
	//This method compute daily wage of employee
	static void computeDailyWage() {

        int empType = (int) (Math.random() * 10) % 3;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is working fulltime");
            working_hour=8;

        }else if (empType == PART_TIME)
        {
            System.out.println("Employee is working parttime");
            working_hour=4;

        }
        else
        {
        	System.out.println("Employee is absent");
        }
        
        int wage = working_hour*WAGE_PER_HOUR;
        System.out.println("Employee Daily Wage is " + wage);
	}
	
	

 public static void main(String[] args) {	
	     computeDailyWage();  	
	        
	    }
	}
	
