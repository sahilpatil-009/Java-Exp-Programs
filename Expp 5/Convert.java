//Convert files

package Mathematical.Convert;
import java.util.*;

public class Convert{
	
	public void BinaryToDecimal(String binary)
    {
        System.out.println(" Binary to Decimal is " + Integer.parseInt(binary,2) );
    }
	
	public void BinaryToOctal(String binary)
	{
		int dec;
        dec = Integer.parseInt(binary,2);
        System.out.println(" Binary to Octal is " + Integer.toOctalString(dec));
	}
	
	public void BinaryToHexadeciaml(String binary)
	{
		int dec;
        dec = Integer.parseInt(binary,2);
        System.out.println(" Binary to Decimal is " + Integer.toHexString(dec));
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	
	public void OctalToBinary(String octal)
	{
		int dec;
        dec = Integer.parseInt(octal,8);
        System.out.println(" Octal to Binary is "+ Integer.toBinaryString(dec));
	}
	
	public void OctalToDecimal(String octal)
	{
		System.out.println(" Octal to Decimal is " +Integer.parseInt(octal,8)) ;
	}
	
	public void OctalToHexadecimal(String octal)
	{
		int dec;
        dec = Integer.parseInt(octal,8);
        System.out.println(" Octal to Hexadecimal is "+ Integer.toHexString(dec));
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	
	public void DecimalToBinary(int decimal)
	{
		System.out.println(" Decimal to Binary is " + Integer.toBinaryString(decimal));
	}
	
	public void DecimalToOctal(int decimal)
	{
		System.out.println(" Decimal to Octal is " + Integer.toOctalString(decimal));
	}
	
	public void DecimalToHexadecimal(int decimal)
	{
		System.out.println(" Decimal to Hexadecimal is " + Integer.toHexString(decimal));
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	
	public void HexadecimalToBinary(String hexadecimal)
	{
		int decx;
        decx = Integer.parseInt(hexadecimal,16);
        System.out.println(" Hexadecimal to Binary is " + Integer.toBinaryString(decx));
	}
	
	public void HexadecimalToOcatl(String hexadecimal)
	{
		int decx;
        decx = Integer.parseInt(hexadecimal,16);
        System.out.println(" Hexadecimal to Octal is " + Integer.toOctalString(decx));
	}
	
	public void HexadecimalToDeciaml(String hexadecimal)
	{
		System.out.println(" Hexadecimal to Decimal is " + Integer.parseInt(hexadecimal,16));
	}
}