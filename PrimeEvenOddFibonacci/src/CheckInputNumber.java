import java.util.Scanner;

public class CheckInputNumber
{
    public static int positiveInteger(Scanner scan, String message)
    {
        int num = 0;
        boolean isValidInput = false;

        while (!isValidInput)
        {
            try
            {
                System.out.println(message);
                num = scan.nextInt();
                isValidInput = num > 0;
                if (!isValidInput)
                {
                    System.out.println("Please key in a positive integer greater than 0.");
                    scan.nextLine();
                }
            }
            catch (Exception e)
            {
                System.out.println("Please key in a positive integer greater than 0.");
                scan.nextLine();
            }
        }
        return num;
    }

}
