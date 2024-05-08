import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci
{
    // Get the number of fibonacci sequence based on number given
    public ArrayList<Integer> fibonacci(int number)
    {
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        // if number is less than 0, return empty array
        if (number < 0)
            return fibonacciNumbers;
        // if number is 0 or 1, return {0}
        fibonacciNumbers.add(0);

        if (number > 1) fibonacciNumbers.add(1);
        // add the 2 numbers before to find the next number
        for (int i = 2; i < number; i++)
        {
            int nextNum = fibonacciNumbers.get(i-1) + fibonacciNumbers.get(i-2);
            fibonacciNumbers.add(nextNum);
        }
        return fibonacciNumbers;
    }

    public static void handleFibonacciChoice(Scanner scan, Fibonacci f)
    {
        int fNumber;

        fNumber = CheckInputNumber.positiveInteger(scan, "Enter number of fibonacci numbers to show (Enter an positive integer): ");
        System.out.println("Fibonacci Sequence : " + f.fibonacci(fNumber));
    }
}
