import java.io.*;

/**
*
* @author PRACHI
*/

public class ceasercipher
{
//	Variable declaration
	static int key, abc, a, b, c, d;
	static char temp;
	static String s;
	
//	Function to encrypt text using Caesar Cipher
	public static String caeserify(String plain_text) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char str[] = new char[plain_text.length()];
		
		System.out.println("Enter key 1: ");
		key = Integer.parseInt(br.readLine());
		
//		Shifting the characters right by 'key1' units
		for(int i=0 ; i<plain_text.length() ; i++)
		{
			temp = plain_text.charAt(i);
			abc = (int) temp;
			a = abc-65;
			b = a+key;
			c = b%26;
			d = c+65;
			str[i] = ((char)d);
		
		}
		s = new String(str);
		return s; 
	}
	
//	Function to decrypt Caesar cipher text
	public static String uncaeserify(String plain_text) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		normaliseText nm = new normaliseText();
		
		System.out.println("Enter key");
		key = Integer.parseInt(br.readLine());
		
		plain_text = nm.removeChar(plain_text, "x"); 
		
		char str[] = new char[plain_text.length()];
		
//		Shifting the characters left by 'key1' units
		for(int i=0 ; i<plain_text.length() ; i++)
		{
			temp = plain_text.charAt(i);
			abc = (int) temp;
			a = abc-65;
			b = a-key;
			c = b%26;
			d = c+65;
			str[i] = ((char)d);
		
		}
		
		s = new String(str); //Converting character array to string
		return s; 
	}
}
