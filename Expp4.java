/*Title: Implementation of Interface
Problem
Statement:
Create the interface stack which has variable size,abstract methods push(),pop(),display(), 
overflow() and underflow(). We need to implement 3 subclasses IntegerStack, StringStack and 
DoubleStack respectively by implementing interface. All the methods in interface are declared 
for string. And in subclass for integerStack convert string to integer. Samething to all other. 
Create one test class and check for the working of all the classes.
*/

import java.util.*;
interface Allstack{
	
	public abstract void push(int i);
	
	public abstract void pop();
	
	public abstract void display();
	
	public abstract boolean Overflow();
	
	public abstract boolean Underflow();
}

class intstack implements Allstack{
	
	int top = -1;
	int size=100;
	int nsize = 0;
	int j=0;
	
	intstack(int s){
		nsize = s;
	}
	
	int[] arr = new int[size];
	
	public boolean Overflow()
	{
		return top == size-1;
	}
	
	public boolean Underflow()
	{
		return top == -1;
	}

	public void push(int i)
	{
		if(Overflow() || j>nsize)
		{
			System.out.println("Stack is Overflow!");
		}else
		{
			j++;
			top = top+1;
			arr[top] = i;
		}
		
	}
	
	public void pop()
	{
		if(Underflow())
		{
		    System.out.println("Stack is Underflow!");
		}
		else
		{
			System.out.println("Element = "+arr[top]+" Poped !");
			top = top-1;
		}
	}
	
	public void display()
	{
		System.out.println("Elements of stack are");
		for(int j=0;j<=top;j++)
		{
			System.out.println(arr[j]);
		}
	}
	
}

class interfaceTest
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of stacak:");
		int s = sc.nextInt();
		Allstack a1 = new intstack(s);
		
		int ch;
		do{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Enter Choice:");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
						System.out.println("Enter Element to Insert:");
						int e = sc.nextInt();
						a1.push(e);
				break;
				
				case 2:
						a1.pop();
				break;
				
				case 3:
						a1.display();
				break;
				
				case 4:break;
				default:
						System.out.println("Wrong Input !");
				break;
						
			}
			
		}while(ch != 4);
		
	}
}