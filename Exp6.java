/*
Title: Implementation of Exception handling. (Pre Defined Exception)
Problem
Statement:
Develop application which can handle any 5 combination of predefined compile time and runtime 
exceptions using multiple catch blocks. Use throws and finally keywords as well.
*/

import java.util.*;
class exphand{
	
		public int add(int a, int b){
			 
			return a+b;
		}
		
		public int division(int a, int b){
			
			return a-b;
		}
		
		public int multi(int a, int b){
			
			return a*b;
		}
		
		public int divide(int a, int b){
			
			return a/b;
		}
	
}

class exphadTest{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		exphand a = new exphand();
			try{
					System.out.println("Enter Two Number for Add:");
					int i = sc.nextInt();
					int j = sc.nextInt();
					System.out.println("Addition is:"+a.add(i,j));
					
					System.out.println("Enter Two Number for Sub:");
					int c = sc.nextInt();
					int d = sc.nextInt();
					System.out.println("Subtraction is:"+a.division(c,d));
					
					System.out.println("Enter Two Number for Multiply:");
					int e = sc.nextInt();
					int f = sc.nextInt();
					System.out.println("Multiplication is:"+a.multi(e,f));
					
					System.out.println("Enter Two Number for Divide:");
					int g = sc.nextInt();
					int h = sc.nextInt();
					System.out.println("Division is:"+a.divide(g,h));
					
				}catch(ArithmeticException e){
					System.out.println("Cant divide By Zero !");
				}catch(InputMismatchException e)
				{
					System.out.println("Enter Correct Input!");
				}catch(ArrayIndexOutOfBoundsException  e)
				{
					System.out.println("Too large value !");
				}catch(Exception e)
				{
					System.out.println(e);
				}
	}
}