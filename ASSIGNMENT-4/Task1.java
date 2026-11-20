import java.util.Scanner;

class FeeService {
    public boolean payFee(String regNo, double amount) {
        if (regNo.isEmpty()) {
            System.out.println("Invalid Register Number!");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Invalid Amount!");
            return false;
        }

        System.out.println("Payment Successful!");
        System.out.println("Register Number: " + regNo);
        System.out.println("Amount Paid: Rs." + amount);
        return true;
    }

    public void showReceipt(String regNo, double amount) {
        System.out.println("\n--- RECEIPT ---");
        System.out.println("Register Number: " + regNo);
        System.out.println("Amount: Rs." + amount);
        System.out.println("Payment Status: Paid");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FeeService service = new FeeService();

        String regNo = "";
        double amount = 0;

        while (true) {
            System.out.println("\n1. Pay Fee");
            System.out.println("2. Clear");
            System.out.println("3. Receipt");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Register Number: ");
                regNo = sc.nextLine();

                System.out.print("Enter Amount: ");
                amount = sc.nextDouble();
                sc.nextLine();

                service.payFee(regNo, amount);
            } 
            else if (choice == 2) {
                regNo = "";
                amount = 0;
                System.out.println("Fields Cleared!");
            } 
            else if (choice == 3) {
                service.showReceipt(regNo, amount);
            } 
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }
        }

        sc.close();
    }
}
