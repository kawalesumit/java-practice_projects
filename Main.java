import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(1 , 11);
        int attempt = 0;
        int guess;

        System.out.println("Welcome To Number Guessing Game");
        System.out.println("Guess Number Between 1 to 10");

        do {
            System.out.print("Enter Your guess: ");
            guess = scanner.nextInt();
            attempt++;

            if (randomNumber < guess){
                System.out.println("Too High! Try Again");
            }
            else if (randomNumber > guess) {
                System.out.println("Too Low! Try Again");

            }
            else {
                System.out.println("Correct You Have Won 🎊");
            }


        }while (guess != randomNumber);

            System.out.println("No. of Attempts: " + attempt);

            scanner.close();

    }
}
