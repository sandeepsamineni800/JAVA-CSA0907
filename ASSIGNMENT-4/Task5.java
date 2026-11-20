import java.util.Scanner;

public class Task5 {
    public void convert(double amount, String currency) {
        double rate;

        if (currency.equals("USD"))
            rate = 0.012;
        else
            rate = 0.011;

        double result = amount * rate;

        System.out.printf("Converted Amount: %.2f %s%n",
                result, currency);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter INR Amount: ");
        double amount = sc.nextDouble();

        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.print("Select Currency: ");
        int choice = sc.nextInt();

        Task5 m = new Task5();

        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (choice == 1) {
            m.convert(amount, "USD");
        } else if (choice == 2) {
            m.convert(amount, "EUR");
        } else {
            System.out.println("Invalid currency");
        }

        sc.close();
    }
} 
