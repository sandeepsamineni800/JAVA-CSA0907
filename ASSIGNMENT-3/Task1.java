import java.util.Scanner;
import java.io.FileNotFoundException;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account number: ");
            int account = sc.nextInt();

            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            System.out.print("Is card reader available? (yes/no): ");
            String card = sc.next();

            if (card.equalsIgnoreCase("no")) {
                throw new FileNotFoundException(
                    "Card reader file is missing");
            }

            if (amount < 0) {
                throw new IllegalArgumentException(
                    "Negative amount not allowed");
            }

            if (amount > balance) {
                throw new ArithmeticException(
                    "Insufficient balance");
            }

            balance = balance - amount;

            System.out.println("Account Number: " + account);
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Enter numbers only");

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("ATM transaction completed");
            sc.close();
        }
    }
}
