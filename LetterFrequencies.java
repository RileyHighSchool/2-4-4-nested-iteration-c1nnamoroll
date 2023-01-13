/*
 * Activity 2.4.4
 */
import java.util.Scanner;
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Type any phrase you want here!");

		String letters = "abcdefghijklmnopqrstuvwxyz";
		String phrase = sc.nextLine();
		phrase = phrase.toLowerCase();

		System.out.println("The following shows the letter frequencies for the phrase");

    	/* your code here */
		// for loop to go through alphabet
		for (int i = 0; i < 26; i++){
			String lets = letters.substring(i, i + 1);

			// counter variable
			int count = 0;

			// inner for loop to go through phrase
			for (int inside = 0; inside < phrase.length(); inside++){
			String phraseLets = phrase.substring(inside, inside + 1);
				if (lets.equals(phraseLets)){
					count++;
				}
			}
			System.out.println(lets + " appears " + count + " time(s).");
	}
	}
}