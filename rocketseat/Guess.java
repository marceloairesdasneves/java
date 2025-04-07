//Guess player's number
import java.util.Scanner;
import java.io.Console;
import java.util.Random;

public class Guess {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
            int computerChooseNumber = new Random().nextInt(10);
            System.out.println(computerChooseNumber);

            System.out.println("Choose a number between 0 and 10");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            System.out.println("Your guess is " + guess + " and computer choose " + computerChooseNumber);

            if (guess == computerChooseNumber) 
            {
                System.out.println("You win!");
                break;
            } else 
            {
                System.out.println("You lose!");
            }
            scanner.close();
        }    
    }
}