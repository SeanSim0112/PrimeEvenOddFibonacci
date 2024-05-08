import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenOrOdd
{
    // Find even or odd numbers in an ArrayList
    public ArrayList<Integer> evenOrOdd(int[] numbers, boolean isEven)
    {
        ArrayList<Integer> filteredNumbers = new ArrayList<>();
        for (int number : numbers)
        {
            // add even numbers
            if (isEven && number % 2 == 0)
                filteredNumbers.add(number);
                // add odd numbers
            else if (!isEven && number % 2 == 1)
                filteredNumbers.add(number);
        }
        return filteredNumbers;
    }

    public static void handleEvenOddChoice(Scanner scan, EvenOrOdd eo)
    {
        int size;
        int[] evenOdd;
        boolean isValidInput = false;

        size = CheckInputNumber.positiveInteger(scan, "Size of the array (Enter an positive integer greater than 0): ");
        evenOdd = new int[size];
        for (int i = 0; i < size; i++)
            evenOdd[i] = CheckInputNumber.positiveInteger(scan, "Enter element " + (i + 1) + " (Enter an integer): ");
        System.out.println("The numbers are : " + Arrays.toString(evenOdd));
        while (!isValidInput)
        {
            System.out.println("Key in even or odd : ");
            String evenOrOdd = scan.next();
            if (evenOrOdd.equals("even"))
            {
                System.out.println("Even numbers : " + eo.evenOrOdd(evenOdd, true));
                isValidInput = true;
            }
            else if (evenOrOdd.equals("odd"))
            {
                System.out.println("Odd numbers : " + eo.evenOrOdd(evenOdd, false));
                isValidInput = true;
            }
            else
                System.out.println("Please enter even or odd.");
        }
    }
}
