//Created by Sai Rohith on 2021-06-28
//Copyright © 2021 Sai Rohith. All rights reserved.
//calc
package Lab1.Calculator;
import java.util.Scanner;
	public class calc {
	    public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        System.out.println("Sai Rohith T - 190953059");
	        float a,b,result;
	        char c,choice;
	        /*Using do-while because its asked in the question that "When it finishes the calculation, the program 
			should ask if the user wants to do another calculation"*/
	        do
	        {   
	        //User input to take the first number,operation to be performed and second number
	            System.out.println("enter the first number ");
	            a=s.nextFloat();
	            System.out.println("enter the operator  ");
	            c=s.next().charAt(0);
	            System.out.println("enter the second number ");
	            b=s.nextFloat();
	            //Using switch-case to perform the chosen operation
	            switch(c)
	            {
	                
	                case '+':
	                result=a+b;
	                System.out.println("result="+result);
	                break;
	                
	                case '-': 
	                result=a-b;
	                System.out.println("result="+result);
	                break;
	                
	                case '*':
	                result=a*b;
	                System.out.println("result="+result);
	                break;
	                
	                case '/':
	                result=a/b;
	                System.out.println("result="+result);
	                break;
	                
	                default: 
	                System.out.println("invalid operator");          
	            }
	            //Prompting and asking if user wants to continue
	            System.out.println("do you want to continue? y/n");
	            choice=s.next().charAt(0);
	           }while((choice == 'y') || (choice == 'Y'));
	    }   
	}
