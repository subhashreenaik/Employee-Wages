package com.bridgelabz.assignment;

/**
 * @author Subhashree Naik
 *
 */
public class EmployeeWageCalculation {
	
	//Declaring constant
	final static int WAGE_PER_HOUR=20;
	final int FULL_DAY_HOUR=8;
	
	static int working_hour=0;
	
	//This method compute daily wage of employee
	static void computeDailyWage() {

        int empType = (int) (Math.random() * 10) % 2;
        if (empType == 1)
        {
            System.out.println("Employee is Present");
            working_hour=8;

        } else
        {
            System.out.println("Employee is Absent");
            working_hour=0;

        }
        int wage = working_hour*WAGE_PER_HOUR;
        System.out.println("Employee Daily Wage is " + wage);
	}
	
	

 public static void main(String[] args) {	
	     computeDailyWage();  	
	        
	    }
	}
	
