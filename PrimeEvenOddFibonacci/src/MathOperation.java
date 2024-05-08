import java.util.Scanner;

public class MathOperation
{
    private static final int primeChoice = 1;
    private static final int evenOddChoice = 2;
    private static final int fibonacciChoice = 3;

    public static void main(String[] args)
    {
        PrimeNumbers pn = new PrimeNumbers();
        EvenOrOdd eo = new EvenOrOdd();
        Fibonacci f = new Fibonacci();
        Scanner scan = new Scanner(System.in);
        int choice = getUserChoice(scan);
        switch (choice)
        {
            case primeChoice:
                PrimeNumbers.handlePrimeChoice(scan, pn);
                break;
            case evenOddChoice:
                EvenOrOdd.handleEvenOddChoice(scan, eo);
                break;
            case fibonacciChoice:
                Fibonacci.handleFibonacciChoice(scan, f);
                break;
        }
        scan.close();
    }

    private static int getUserChoice(Scanner scan)
    {
        int choice = 0;
        boolean isInt = false;

        System.out.println("1. Find prime numbers");
        System.out.println("2. Find even or odd numbers");
        System.out.println("3. Show fibonacci numbers");
        while (!isInt)
        {
            try
            {
                System.out.println("Enter your choice (1, 2, 3): ");
                choice = scan.nextInt();
                isInt = choice >= primeChoice && choice <= fibonacciChoice;
                if (!isInt)
                {
                    System.out.println("Please key in 1, 2 or 3.");
                    scan.nextLine();
                }
            }
            catch (Exception e)
            {
                System.out.println("Please key in 1, 2 or 3.");
                scan.nextLine();
            }
        }
        return choice;
    }
}
