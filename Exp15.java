/*15
Title: Implementation of Collections(Hashmap,LinkedHashMap).
Problem
Statement:
Fill a HashMap with key-value pairs. Print the results to show ordering by hash code. Extract the 
pairs, sort by key, and place the result into a LinkedHashMap. Show that the insertion order is 
maintained.
*/

import java.util.*;
class exp15{
	
	public static void main(String[] args)
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>(); //Declare Hashmap of type <Integer(key),String(value)>
		
		hm.put(126,"Pankaj"); //this is How we put data in Hashmap
		hm.put(131,"Abhi");
		hm.put(143,"Harshwardhan");
		hm.put(139,"Ahustosh");
		hm.put(153,"Sourabh");
		
		System.out.println("This is Hashmap Method !");
		
		System.out.println(hm); //display Key=Value in Hashmap
		
		System.out.println("key:"+hm.keySet()); //display Only key's in Hashmap
		
		System.out.println("Value:"+hm.values()); //display Only Values in HashMap
		
		//HashMap Stores Values In Random Order
		
		System.out.println("This is TreeMap Method !");
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>(hm); //Declaration of TreeMap
		
		tm.put(150,"Sahil"); //puting values in TreeMap
		//tm.put(101,"ChadiNo4");
		System.out.println(tm); //dispay all values key-value in TreeMap 
		
		System.out.println("Keys"+tm.keySet()); //Display Only key 
		
		System.out.println("Values"+tm.values()); //Display Only key
	}
}