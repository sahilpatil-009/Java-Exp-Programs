/*Title: Implementation of package and creation of jar file.
Problem
Statement:
Develop a mathematical package for Statistical operations like Mean, Median, Average, Standard 
deviation. Create a sub package in the math package convert. In convert package provide 
classes to convert decimal to octal, binary, hex and vice-versa. Develop application program to 
use this package, and build executable jar file of it.
*/

package Mathematical;
import java.util.*;

public class Arithmatic{
	
	Scanner sc = new Scanner(System.in);
	int sum;
	int asum;
	//int arr[] = new int[5];
	
	public void Mean(int arr[]){
		for(int i=0;i<5;i++)
		{
			sum += arr[i];
		}
		int mean = sum/5;
		
		System.out.println("Mena is:"+mean);
	}
	
	public void Median(int arr[]){
		
		int med = (5-1)/2;
		System.out.println("Median is:"+arr[med]); 
	}
	
	public void Average(int arr[]){
		for(int i=0;i<5;i++)
		{
			asum += arr[i];
		}
		
		int avg = asum/5;
		System.out.println("Mena is:"+avg);
		
	}
	
	public void std(int arr[]){
		
		int ssum = 0, standardDeviation = 0;
        int length = arr.length;

        for(int num : arr) {
            ssum += num;
        }

        int mean = ssum/length;

        for(int num: arr) {
            standardDeviation += Math.pow(num - mean, 2);
        }
		
		
		System.out.println("Standrad Deviation is:"+Math.sqrt(standardDeviation/length));
		
	}
}