/*Use of instance variables, constructors, getter, setters.
Create a class called Employee that includes three pieces of information as instance variable first name, a last name and a monthly salary. 
Your class should have a constructor that initializes 
the three instance variables. Provide a set and a get method for each instance variable. If the 
monthly salary is not positive, set it to 0.0. Write a test application named EmployeeTest that 
demonstrates class Employee's capabilities. Create two Employee objects and display each 
object's yearly salary. Then give each Employee a 10% raise and display each Employee's yearly 
salary again*/
import java.util.*;
class Employee{
	String Fname,Lname;
	double Msal;
	Employee(String fname, String lname,double msal)
	{
		this.Fname = fname;
		this.Lname = lname;
		this.Msal = msal;
	}
	
	public void set()
	{
		if(Msal < 0.0)
		{
			Msal = 0.0;
		}
	}
	
	public void get()
	{
		double Ysal = Msal*12;
		System.out.println("Yearly Salary of "+Fname+" "+Lname+" is: "+Ysal);
		double Rsal = Ysal + YsaSl*0.10;
		System.out.println("Raise YEarly Salaray of "+Fname+" "+Lname+" is: "+Rsal);
		
	}
}

class Emptest{
	
	public static void main(String[] args)
	{
		Employee E1 = new Employee("Sahil","Patil",60000);
				 E1.set();
				 E1.get();
		Employee E2 = new Employee("Mahes","Patil",80000);
				 E2.set();
				 E2.get();			 
	}
	
}