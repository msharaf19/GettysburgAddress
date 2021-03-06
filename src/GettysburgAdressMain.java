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
					
					for (int i = 0; i < longestWord.length(); i++) 
					{
						if (longestWord.charAt(i) == '-') 
						{
							longestWord = longestWord.replace('-', ' ');
							longestWord = longestWord.substring(0,i);
							
						}
					}
					
				}
			}
			
			
			for( String str: address) 
			{
				avgLength += str.length();
				count++;
				
			}
			
			
			
			
		}
		double average = avgLength/count;
		
		System.out.println("The longest word: " + longestWord);
		
		
		
		System.out.println("The average length is: "+ average);
		
		file.close();
	}

}

