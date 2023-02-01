/*Title: Implementation of Exception handling. (User defined Exception)
Problem
Statement:
Develop a Bank class which should contain all methods of Bank I.e balanceEnquery, withdraw, 
transfer and deposit. You should create at least two objects of Bank and do all operations 
mentioned above. Also generate user defined exception LowBalanceException, 
NegetiveNumberException and PasswordMismatchException whenever required. For transfer 
use two bank objects. 
*/

import java.util.*;
class LowBalanceException extends Exception{}

class NegativeNumberException extends Exception{}

class PasswordMismatchException extends Exception{}



class Bank{
	
	public static int Accno=9090;
	String password;
	static double balance;
	
	Bank(String pass,double bal){
		this.password = pass;
		this.balance = bal;
		this.Accno = Accno+10;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void balanceEnquery(){
	try{
			System.out.println("Enter Password:");
			String newpass = sc.next();
			
			if(newpass.equals(this.password))
			{
				System.out.println("Accout No:"+this.Accno);
				System.out.println("Balance is:"+this.balance);
			}
			else
			{
				throw new PasswordMismatchException();
			}
		
		}catch(PasswordMismatchException e){
			System.out.println("Wrong Password!");
		}
	}
	
	public void withdraw(){
		try{
			System.out.println("Enter Password:");
			String newpass = sc.next();
			
			if(newpass.equals(this.password))
			{
				System.out.println("Accout No:"+this.Accno);
				System.out.println("Balance is:"+this.balance);
				System.out.println("Enter Amount to be Withdrow:");
				double wid = sc.nextDouble();
				
				if(wid >= balance-100)
				{
					throw new LowBalanceException();
				}
				if(wid < 0)
				{
					throw new NegativeNumberException();
				}
				else
				{
					System.out.println("Withdrow Succesfully of amount"+wid);
					balance = balance - wid;  
					System.out.println("Balance is:"+balance);
				}
			}
			else
			{
				throw new PasswordMismatchException();
			}
		
		}catch(PasswordMismatchException e){
			System.out.println("Wrong Password !");
		}catch(LowBalanceException e){
			System.out.println("Low Balance !");
		}catch(NegativeNumberException e){
			System.out.println("Please Enter Positive Amount!");
		}
	}
	
	public void transfer(){
		try{
			System.out.println("Enter Password:");
			String newpass = sc.next();
			
			if(newpass.equals(this.password))
			{
				System.out.println("Enter Aamout to be transfer:");
				double tamt = sc.nextDouble();
				System.out.println("Enter Account no:");
				int trfacc = sc.nextInt();
				
				this.balance = balance-tamt;
				//transfer.balance = transfer.balance + tamt;
				System.out.println("Balance is:"+balance);

			}
			else
			{
				throw new PasswordMismatchException();
			}
		}catch(PasswordMismatchException e){
			System.out.println("Wrong Password !");
		}
	}
	
	public void deposit(){
		try{
			System.out.println("Enter Password:");
			String newpass = sc.next();
			
			if(newpass.equals(this.password))
			{
				System.out.println("Accout No:"+this.Accno);
				System.out.println("Balance is:"+this.balance);
				System.out.println("Enter Amount to be deposit:");
				double dep = sc.nextDouble();
				if(dep < 0)
				{
					throw new NegativeNumberException();
				}
				else
				{
					System.out.println("Withdrow Succesfully of amount"+dep);
					balance = balance + dep;  
					System.out.println("Balance is:"+balance);
				}

			}
			else
			{
				throw new PasswordMismatchException();
			}
		
		}catch(PasswordMismatchException e){
			System.out.println("Wrong Password !");
		}catch(NegativeNumberException e){
			System.out.println("Please Enter Positive Amount!");
		}
	}
}

class testBank
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		System.out.println("Enter Balance Amount:");
		double bal = sc.nextDouble();
		Bank b = new Bank(pass,bal);
		
			 int ch;
			 do{
				 System.out.println("1.Balance Enquiry");
				 System.out.println("2.Withdrow");
				 System.out.println("3.transfer");
				 System.out.println("4.Deposit");
				 System.out.println("5.Exit");
				 System.out.println("Choose Choice:");
				 ch = sc.nextInt();
				 
				 switch(ch)
				 {
					 case 1:
							b.balanceEnquery();
					 break;
					 
					 case 2:
							b.withdraw();
					 break;
					 
					 case 3:
							b.transfer();
					 break;
					 
					 case 4:
							b.deposit();
					 break;
				 }
				 
			 }while(ch != 5);
	}
}