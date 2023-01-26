//Use of static members of the class
/*Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest 
rate for all account holders. Each object of the class contains a private instance variable 
savingsBalance indicating the amount the saver currently has on deposit. Provide method 
calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by 
annualInterestRate divided by 12this interest should be added to savingsBalance. Provide a static 
method modifyInterestRate that sets the annualInterestRate to a new value.
Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and 
saver2, with balances of Rs 2000.00 and Rs 3000.00, respectively. Set annualInterestRate to 4%, 
then calculate the monthly interest and print the new balances for both savers. Then set the 
annualInterestRate to 5%, calculate the next month's interest and print the new balances for both 
savers.
*/

import java.util.Scanner;

class SavAcc{
	static double AIR = 0.04;
	double SavBal;
	String nm;
	
	SavAcc(String Nm, double bal)
	{
		this.nm = Nm;
		this.SavBal = bal;
	}
	
	public void CalMIR()
	{
		double Mir = SavBal*AIR/12;
		SavBal = SavBal + Mir;
		
		System.out.println("Monthly Interest of "+nm+" for "+(AIR*100)+"% Rate is: "+Mir+"and Saving Balance is:"+SavBal);
	}
	
	public static void modifyIRT()
	{
		AIR = 0.05;
	}
}

class SavAcctest{
	
	public static void main(String[] args){
	SavAcc s1 = new SavAcc("Sahil",40000);
			s1.CalMIR();
			s1.modifyIRT();
			s1.CalMIR();
	SavAcc s2 = new SavAcc("Mahesh",60000);
			s2.CalMIR();
			s2.mofiyIRT();
			s2.CalMIR();
	}
}