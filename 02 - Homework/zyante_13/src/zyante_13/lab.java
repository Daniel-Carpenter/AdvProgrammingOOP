package zyante_13;
import java.util.Scanner;
import java.util.InputMismatchException;


public class lab 
{
	

	   public static void main(String[] args) throws InputMismatchException
	   {
	      Scanner scnr = new Scanner(System.in);

	      String inputName;
	      int age;
	      inputName = scnr.next();
	      

         while (!inputName.equals("-1")) 
         {
        	 if (scnr.hasNextInt())
        	 {
        		 try
        		 {
        			 age = scnr.nextInt();
        		 }
        		 
        		 catch (InputMismatchException except)
        		 {
        			 age = -1;   
        		 }
        		 
        		 System.out.println(inputName + " " + (age + 1));          		 
        		 
        		 inputName = scnr.next();  
        	 }
        	 else
        	 {
        		 scnr.next();
        		 System.out.println();
        		 scnr.nextInt();
        		 inputName = scnr.next();  
        	 }
        	 
            
            
         }
	   }
	}

