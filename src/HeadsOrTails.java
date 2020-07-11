import java.util.Scanner;
public class HeadsOrTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Guess which will have more: heads or tails? ");
		String headsOrTailsGuess = scnr.next();
		System.out.print("How many times shall we flip a coin? ");
		int numberOfFlips = scnr.nextInt();
		System.out.println();
		int correctCount = 0;
		String randGuess=null;
		String result=null;
		double guessedPercentage=0.0;
		for(int i=0;i<numberOfFlips;i++) {
			int n = (int)(Math.random()*10);
			if(n%2==0) {
				randGuess="heads";
			}
			else
			{
				randGuess="tails";
			}
			System.out.println(randGuess);
			if(randGuess.equalsIgnoreCase(headsOrTailsGuess)) {
				correctCount+=1;
			}
		}
		guessedPercentage=(correctCount/(double)numberOfFlips)*100;
		result= "Your guess, "+headsOrTailsGuess+", came up " +correctCount+ " time (s).\n" +"That's " +guessedPercentage+"%.";
		System.out.println();
		System.out.println(result);
		}catch (Exception e) {

            System.out.println("\nINVALID INPUT\n");
         }
	}

}
