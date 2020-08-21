package myfirstjavaprogram;

public class ExceptionHandling {

	public static void main(String[] args) {
	

	
	try { 
		
		System.out.println("All Praise to God..!!");
		System.out.println("Let peace be with this nation ");
		int i= 1/0;
		System.out.println("And peace be with you.. ");
		
	    }
	catch (Exception exp) {
		System.out.println("I'm Inside Exception BLOCK");
		System.out.println("Message: " +exp.getMessage());
		System.out.println("Cause: " +exp.getCause());
		exp.printStackTrace();
	}
	finally {
		
		System.out.println("I'm inside FINALLY BLOCK");
	        }
		
	                      
	
	                                       }
	

                              }
