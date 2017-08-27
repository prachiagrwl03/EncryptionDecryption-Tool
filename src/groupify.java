import java.io.*;

/**
*
* @author PRACHI
*/

public class groupify
{
	static String str = "";
	
//	Sub-routine to group 'key2' elements together and put space in between
	static String groupify1(String s, int d, int si)
	{
		int c = 0, k;
		if(s.length() == d)
			return s;
		
//		Condition to put grouping element 'x' if the last group does not contain appropriate number of characters
		if(s.length()<d)
		{
			c=d-(s.length());
			for(int i = 0 ; i< c ; i++)
			{
				str += "x";
			}
			return (s + str);
		}
		k = si+d;
		
//		Recursive call to add space after 'key2' characters
		return s.substring(si, k)+" "+groupify1((s.substring(k,s.length())), d, 0);
	}
		
//	Sub-routine to remove spaces
	static String ungroupify(String s)
	{
		normaliseText nt = new normaliseText();
		str = nt.removeChar(s, " ");
		
		return str;
	}
}
