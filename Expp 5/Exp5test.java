//testing of package and jar file

import Mathematical.Arithmatic;
import  Mathematical.Convert.Convert;
import java.util.*;

class Exp5test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
				   
		//Convert c1 = new Convert();
					//c1.BinaryToDecimal("1100");
					//c1.BinaryToOctal("1100");
					//c1.BinaryToHexadeciaml("1100");
					
					//c1.OctalToBinary("16");
					//c1.OctalToDecimal("16");
					//c1.OctalToHexadecimal("16");
					
					//c1.DecimalToBinary(19);
					//c1.DecimalToOctal(17);
					//c1.DecimalToHexadecimal(25);
					
					//c1.HexadecimalToBinary("C");
					//c1.HexadecimalToOcatl("C");
					//c1.HexadecimalToDeciaml("C");
				
				int ch,ich,dec,dec1,dec2;
				String binary,binary1,binary2,Octa,Octa1,Octa2,hex,hex1,hex2;
				do{
					System.out.println("1.Arithmatic operations(Mean,Median,Average,Standerd Deviation)");
					System.out.println("2.Conversion Operation(Binary,Decimal,Octal,Hexadecimal,)");
					System.out.println("3.Exit");
					System.out.println("Enter your Choice:");
					ch = sc.nextInt();
					
					switch(ch)
					{
						case 1:	
								int arr[] = new int[5];
								System.out.println("Enter 5 Elements of array:");
								for(int i=0;i<5;i++)
								{
									arr[i] = sc.nextInt();
								}
								
								Arithmatic a1 = new Arithmatic();
										   a1.Mean(arr);
										   a1.Median(arr);
										   a1.Average(arr);
										   a1.std(arr);
						break;
						
						case 2:
								do{
									Convert c1 = new Convert();
									System.out.println("\n 1.BinaryToDecimal \n 2.BinaryToOctal \n 3.BinaryToHexadeciaml \n 4.OctalToBinary \n 5.OctalToDecimal \n 6.OctalToHexadecimal \n 7.DecimalToBinary \n 8.DecimalToOctal \n 9.DecimalToHexadecimal \n 10.HexadecimalToBinary \n 11.HexadecimalToOcatl \n 12.HexadecimalToDeciaml");
									System.out.println(" 13.Exit");
									System.out.println("Enter Choice:");
									ich = sc.nextInt();
									switch(ich){
									case 1:
											System.out.println("Enter Binary No(ex:1100):");
											binary = sc.next();
											c1.BinaryToDecimal(binary);
									break;
									
									case 2:
											System.out.println("Enter Binary No(ex:1100):");
											binary1 = sc.next();
											c1.BinaryToOctal(binary1);
									break;
									
									case 3:
											System.out.println("Enter Binary No(ex:1100):");
											binary2 = sc.next();
											c1.BinaryToHexadeciaml(binary2);
									break;
									
									case 4:
											System.out.println("Enter Octal No(ex:16):");
											Octa = sc.next();
											c1.OctalToBinary(Octa);
									break;
									
									case 5:
											System.out.println("Enter Octal No(ex:16):");
											Octa1 = sc.next();
											c1.OctalToDecimal(Octa1);
									break;
									
									case 6:
											System.out.println("Enter Octal No(ex:16):");
											Octa2 = sc.next();
											c1.OctalToHexadecimal(Octa2);
									break;
									
									case 7:
											System.out.println("Enter Decimal No(ex:12):");
										    dec = sc.nextInt();
											c1.DecimalToBinary(dec);
									break;
									
									case 8:
											System.out.println("Enter Decimal No(ex:12):");
										    dec1 = sc.nextInt();
											c1.DecimalToOctal(dec1);
									break;
									
									case 9:
											System.out.println("Enter Decimal No(ex:12):");
											dec2 = sc.nextInt();
											c1.DecimalToHexadecimal(dec2);
									break;
									
									case 10:
											System.out.println("Enter Hexadecimal No(ex:C):");
										    hex = sc.next();
											c1.HexadecimalToBinary(hex);
									break;
									
									case 11:
											System.out.println("Enter Hexadecimal No(ex:C):");
											hex1 = sc.next();
											c1.HexadecimalToOcatl(hex1);
									break;
									
									case 12:
											System.out.println("Enter Hexadecimal No(ex:C):");
											hex2 = sc.next();
											c1.HexadecimalToDeciaml(hex2);
									break;
									}	
									
								}while(13!=ich);	
					}
				}while(3!=ch);
	}
}