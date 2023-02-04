/*Title: Simple file handling program in java.
Problem
Statement:

	Take file name as input to your program through command line, If file is existing the open and 
display contents of the file. After displaying contents of file ask user – 1.do you want to add the 
data at the end of file or 2.replace specified text in file by other text. Based on user’s response, 
then accept data from user and append it to file. If file in not existing then create a fresh new file 
and store user data into it. Also. User should type exit on new line to stop the program. Do this 
program using Character stream classes.
*/


import java.util.*;
import java.io.*;

class file_Handling{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try{
			
			int ch;
			BufferedReader br;
			br = new BufferedReader(new InputStreamReader(System.in));
			
			do{				
			System.out.println("\n 1.do you want to add the data at the end of file \n 2.replace specified text in file by other text\n 3.Exit \n Enter Choice:");
			ch = sc.nextInt();
			switch(ch){
			case 1:
			System.out.println("Enter Name of file:");
			String nm = br.readLine();
			
			//File f1 = new File(nm);
			
					File f1 = new File(nm);
					if(f1.isFile())
					{
						System.out.println("File already Exist!");
						System.out.println("And it Data is:");
						BufferedReader b1 = new BufferedReader(new FileReader(nm));
						String line;
						
						while((line = b1.readLine())!=null)
						{
							System.out.println(line);
						}
						
						System.out.println("Do you Want to Write Data(y/n)");
						String wr = sc.next();
										
								if(wr.equals("y"))
									{
										BufferedWriter b2 = new BufferedWriter(new FileWriter(nm,true));

										System.out.println("Add contex:");
										String dt=sc.nextLine();
											
										while(!(dt = br.readLine()).equals("exit"))
										{
											b2.write("\n"+dt);
										}
											b2.close();
									}else{
										System.out.println("OK");
									}
					}
					else
					{
						System.out.println("DO you Want ot Create New FIle(y/n)");
						String dec = sc.next();
						
						if(dec.equals("y"))
						{
							System.out.println("Enter Name of File:");
							String fn = sc.next();
							
							DataOutputStream d1 = new DataOutputStream(new FileOutputStream(fn));
						}
						else
						{
							System.out.println("Thank You !");
						}
					}
					break;
					
					case 2:
								System.out.println("Enter File Name:");
								String nf = sc.next();
								
								File f2 = new File(nf);
									if(f2.isFile())
									{
											System.out.println("File already Exist!");
											System.out.println("And it Data is:");
											BufferedReader b1 = new BufferedReader(new FileReader(nf));
											String lline;
											
										while((lline = b1.readLine())!=null)
										{
												System.out.println(lline);
										}
										
										//FileReader fr = new FileReader();
										
										//BufferedReader b3 = new BufferedReader(nf);
										
										FileWriter fw = new FileWriter(nf);
										
										BufferedWriter bw = new BufferedWriter(fw);
										
										String nline = null;
										
										System.out.println("Enter Data to replace:");
										String serch = sc.next();
										
										System.out.println("Enter Replace data:");
										String replace = sc.next();
								 
										while((nline=br.readLine()) != null) 
										{
											
											nline.replaceAll(serch, replace); 
											//I also tried , line=line.replaceAll("javascript", "perl script"); 
										}
										bw.write(nline);
										bw.close();
									}
									else{
										
										System.out.println("File Not Exist !");
									}
					break;
				}
			}while(ch != 3);
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
}


