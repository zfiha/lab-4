import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter the number: ");
        String number = scanner.nextLine();

                System.out.print("Enter the base of the number: ");
        int fromBase = scanner.nextInt();
        System.out.print("Enter the base to convert to: ");
        int toBase = scanner.nextInt();

        try {
            
            int decimalValue = Integer.parseInt(number, fromBase);

                       String convertedNumber = Integer.toString(decimalValue, toBase);

            System.out.println("The number in base " + toBase + " is: " + convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number or base.");
        }
    }
}