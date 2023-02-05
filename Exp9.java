/*Title: Implementation of reading student data and store it into file.
Problem
Statement:
Take Student information such as name, age, weight, height, city, phone from user and store it in 
the file using DataOutputStream and FileOutputStream and Retrive data using DataInputStream 
and FileInputStream and display the result. Use serialization concept and Bytestream classes.
*/

import java.util.*;
import java.io.*;

class stud_file{
	
	public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in); 	
				
			try{
					DataOutputStream d1 = new DataOutputStream(new FileOutputStream("student.txt"));
					
					System.out.println("Enter Your Name:");
					String name = sc.nextLine();
					d1.writeBytes("\n"+name);
					
					System.out.println("Enter Your Age:");
					String age = sc.nextLine();
					d1.writeBytes("\t"+age);
					
					System.out.println("Enter Your Weight");
					String weight = sc.nextLine();
					d1.writeBytes("\t"+weight);
					
					System.out.println("Enter Your Height:");
					String height = sc.nextLine();
					d1.writeBytes("\t"+height);
					
					System.out.println("Enter Your City:");
					String city = sc.nextLine();
					d1.writeBytes("\t"+city);
					
					System.out.println("Enter Your Phone:");
					String phone = sc.nextLine();
					d1.writeBytes("\t"+phone);
					
					FileInputStream i = new FileInputStream("student.txt");
					 int s=i.read();  
					
					while((s=i.read())!= -1)
					{
						System.out.print((char)s);
					}
					i.close();
			}catch(Exception e){
				System.out.println(e);
			}
	}
}