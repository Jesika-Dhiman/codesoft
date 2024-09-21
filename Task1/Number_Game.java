import java.util.InputMismatchException;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        System.out.println("************** Welcome  To Number Guessing Game *************");
        Scanner scanner = new Scanner(System.in);
        int random=0;
        try
        {
            //Generate random number
            random = (int) (Math.random() * 100 + 1);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter the Random between 1 to 100");
        System.out.println("You give the chances five time");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the random number: ");
            int number = scanner.nextInt();

            if (number == random)
            {
                System.out.println("Congratulations you guess the correct number");
                break;
            }
            else if (number < random)
            {
                System.out.println("Your number less than the original number");
            }
            else
            {
                System.out.println("Your number greater than the original number");
            }
        }

    }
}
