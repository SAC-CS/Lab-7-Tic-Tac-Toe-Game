
package numbersguess;
import javax.swing.JOptionPane;
import java.util.Random;

public class NumbersGuess {

   
    public static void main(String args[])
	{
		String choiceUppercase;
		Random generator = new Random();
		int computerNumber;
		int count = 1;
		computerNumber = generator.nextInt(9)+1;
		
		do
		{
                        String name =
                            JOptionPane.showInputDialog("Please Input a Number Between 1 - 10");
                        int userNumber = Integer.valueOf(name);

		
			if (userNumber == computerNumber)
			{

				String userChoice =
					JOptionPane.showInputDialog("You Guessed Correctly. Play Again?");
				choiceUppercase = userChoice.toUpperCase();

				if (choiceUppercase.equals("YES")){
					count = 1; 
				}else {
				
					count = 2; 
				}
			
			} 
			
			else 
			{

				String userChoice =
					JOptionPane.showInputDialog("You Guessed Incorrectly. Play Again?");
				choiceUppercase = userChoice.toUpperCase();
				if (choiceUppercase.equals("YES")){
					count = 1; 
				}else {
				
					count = 2; 
				}
			}
		}
		while (count == 1);
		
	}

}