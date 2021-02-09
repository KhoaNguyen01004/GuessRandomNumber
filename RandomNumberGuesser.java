/*
 * Class: CMSC203 
 * Instructor:
 * Description: RandomNumberGuesser is a driver class and RNG class is a random number generator class
 * Due: 2/08/2021
 * Platform/compiler: Visual Studio Code
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Kevin Nguyen
*/

import java.util.Scanner;
public class RandomNumberGuesser {

    private static Scanner stdin = new Scanner(System.in);
    public static void main (String[] args)
    {
        int input;
        int high = 100;
        int low = 1;
        int randomNumber = RNG.rand();
        int counter = 0;
        String again = "y";

        System.out.println("Please enter your first guess: ");
        do
        {
            input = stdin.nextInt();
            if (input > high || input < low)
            {
                RNG.inputValidation(input, low, high);
            }
            else if (input != randomNumber)
            {
                if (input > randomNumber)
                {
                    System.out.println("Number of guess is " + (++counter));
                    high = input;
                    System.out.println("Your guess is high!!!");
                    System.out.println("Please enter your guess between (" + low + "-" + high + ")");
                }
                else 
                {
                    System.out.println("number of guess is " + (++counter));
                    low = input;
                    System.out.println("Your guess is low!!!");
                    System.out.println("Please enter your guess between (" + low + "-" + high + ")");
                }
            }
            else 
            {
                System.out.println("Congratulation you win!!!\nDo you want to play again? (y or n)");
                again = stdin.next();
                if (again.equals("y"))
                {
                    System.out.println("Please enter your first guess: ");
                    high = 100;
                    low = 1;
                    counter = 0;
                    randomNumber = RNG.rand();
                }
            }
        }while (again.equals("y"));

        System.out.print("See you again...");
    }
}
