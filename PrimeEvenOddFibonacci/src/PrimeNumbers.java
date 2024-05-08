import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers
{
    // Check for prime numbers
    public boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++)
            if (number % i == 0) return false; // if number is divisible by other numbers other than itself, it's not a prime.
        // Edge cases
        if (number == 2) return true;
        return number >= 2;
    }

    // Find the first n Prime in an ArrayList
    public ArrayList<Integer> onlyPrimes(int[] numbers, int nPrime)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            if (nPrime > 0 && isPrime(number))
            {
                primes.add(number);
                nPrime--;
            }
        }
        return primes;
    }

    public static void handlePrimeChoice(Scanner scan, PrimeNumbers pn)
    {
        int size;
        int[] pNumbers;
        int n;

        size = CheckInputNumber.positiveInteger(scan, "Size of the array (Enter an positive integer greater than 0): ");
        pNumbers = new int[size];
        for (int i = 0; i < size; i++)
            pNumbers[i] = CheckInputNumber.positiveInteger(scan, "Enter element " + (i + 1) + " (Enter a positive integer): ");
        System.out.println("The numbers are : " + Arrays.toString(pNumbers));
        // find the first n prime
        n = CheckInputNumber.positiveInteger(scan, "Enter number of prime numbers to find (Enter an positive integer and smaller than size of array): ");
        System.out.println("The first " + n + " prime numbers in the array: " + pn.onlyPrimes(pNumbers, n));
    }
}
