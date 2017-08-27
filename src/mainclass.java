import java.io.*;

/**
*
* @author PRACHI
*/

public class mainclass {

	public static void main(String args[])throws IOException
	{
//		Objects creation
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		normaliseText nm = new normaliseText();
		obify		  ob = new obify();
		ceasercipher  cf = new ceasercipher();
		groupify 	  gf = new groupify();
		
//		Variables declaration
		int key;
		String plain;

//		Accepting plain text
		System.out.println("Enter the Plain Text:");
		plain = br.readLine();
		
//		Encryption
		plain = nm.normalise(plain);
		plain = ob.obifyText(plain);
		plain = cf.caeserify(plain);
		
		System.out.println("Enter the key 2: ");
		key = Integer.parseInt(br.readLine());
		
		plain = gf.groupify1(plain,key,0);
		System.out.println("The Encrypted string  is: " + plain);
		
//		Decryption
		plain = gf.ungroupify(plain);
		plain = cf.uncaeserify(plain);
		plain = ob.unobify(plain);
		System.out.println("The Decrypted String is:  " + plain);
	}
}
