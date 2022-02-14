package com.bridgelabz.assignment;

/**
 * @author Subhashree Naik
 *
 */
public class EmployeeWageCalculation {
	
	//This method checks attendance of employee
	static void checkEmployee() {

        int empType = (int) (Math.random() * 10) % 2;
        if (empType == 1)
        {
            System.out.println("Employee is Present");

        } else
        {
            System.out.println("Employee is Absent");

        }
	}
	
	

 public static void main(String[] args) {	
	      checkEmployee();  	
	        
	    }
	}
	
