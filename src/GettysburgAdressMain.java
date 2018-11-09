import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class GettysburgAdressMain {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		
		ArrayList<String> address = new ArrayList<String>();
		
		String longestWord = "";
		int index = 0;
		double avgLength = 0;
		int count = 0;
		
		while(file.hasNext()) 
		{
			String word = file.next();
			address.add(word);
			
			
			
			for ( String speech: address ) 
			{
				if (speech.length() > longestWord.length() ) 
				{
					longestWord = speech;
					
				}
			}
			
			
			for( String str: address) 
			{
				avgLength =+ str.length();
				
			}
			
			

		}
		
		System.out.println("The longest word: " + longestWord);
		
		
		
		System.out.println("The average length is: "+ avgLength);
		
		file.close();
	}

}

