import java.io.*;

/**
*
* @author PRACHI
*/

public class obify
{
//	Function to precede a vowel by "OB"
	public static String fun2(String s, String exp)
	{
		int i = s.indexOf(exp);

		if(i<0)
			return s;
		else
			return s.substring(0,i)+ "OB" + exp +fun2(s.substring(i+1,s.length()), exp); //Recursive call to add "OB" before a vowel
	}
	
	
	public static String obifyText(String input)
	{
		String s = input;
		s = fun2(s, "O");
		s = fun2(s, "A");
		s = fun2(s, "E");
		s = fun2(s, "I");
		s = fun2(s, "U");
		
		return s;
	}
	 
//	Function to remove preceding "OB" from vowels
	public static String  unobify(String input)
	{
		String s = input;
		int i = s.indexOf("OB");
		if(i<0)
			return s;
		else 
			return s.substring(0,i)+unobify(s.substring(i+2,s.length())); //Function to remove "OB" preceding a vowel
	}
	
}