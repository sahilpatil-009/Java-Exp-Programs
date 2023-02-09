/*14
Title: Implementation of Collection (ArrayList,LinkedList).
Problem
Statement:
Write a program to read a text file one line at a time. Read each line as a String and place
that String object into a LinkedList. Print all of the lines in the LinkedList in reverse order.
*/

import java.util.*;
import java.io.*;

class exp14{
	
	public static void main(String[] args){
		
		
		try{
			LinkedList<String>s = new LinkedList<String>(); //Initialization of LinkedList of string type
			//ArrayList<String>s = new ArrayList<String>(); //Initialization of ArrayList of string type
			
			BufferedReader br = new BufferedReader(new FileReader("link.txt")); //BufferedReader for Read File,FileReader to acces link.txt file
			String line;
			
			 while((line = br.readLine())!=null)//While loop read Data in file till null in file
			  {
				  s.add(line); //s.add can add data in LinkedList
			  }
			
			System.out.println("Data into Collection Linked list is:");
			Iterator i = s.iterator(); //Iterator used to acces nodes of Linkedlist
			
			while(i.hasNext()) //i hasnext() is like a pointer to next node in linked list
			{
				System.out.println(i.next()); //i.next() acces the node of LinkedList and SOP Print it 
			}
			
			System.out.println("Data in Reverse Order:");
			
			Collections.reverse(s); //used to Reverse LinkedList or Collections (s)
			
			Iterator j = s.iterator(); // new Iterator for to travers reverse Linkedlist
			
			while(j.hasNext())
			{
				System.out.println(j.next());
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
