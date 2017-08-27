
/**
*
* @author PRACHI
*/

public class normaliseText
{
//	Function to remove punctuation marks and spaces
	static String normalise(String input)
	{
		String s = "";
		
		s = input.toUpperCase();
		s = removeChar(s, " ");
		s = removeChar(s, ".");
		s = removeChar(s, ":");
		s = removeChar(s, ",");
		s = removeChar(s, "?");
		s = removeChar(s, ";");
		s = removeChar(s, "\'");
		s = removeChar(s, "\"");
		s = removeChar(s, "!");
		s = removeChar(s, "(");
		s = removeChar(s, ")");
		
		return s;
	}
	
//	Function to remove and expression/sub-string from a string
	static String removeChar(String s, String exp)
	{
		int i = s.indexOf(exp);

		if(i<0)
			return s;
		else
			return s.substring(0,i)+removeChar(s.substring(i+1,s.length()), exp); //Recursive call to remove an expression/sub-string from an string
	}

}
