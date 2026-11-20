import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
            "Java Programming",
            "Python Basics",
            "Data Structures",
            "Database Management",
            "Web Development"
        };

        while (true) {
            System.out.println("\n--- LIBRARY SEARCH ---");
            System.out.println("1. Search Book");
            System.out.println("2. Previous");
            System.out.println("3. Next");
            System.out.println("4. Reserve Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter book name: ");
                String search = sc.nextLine();

                boolean found = false;

                for (String book : books) {
                    if (book.toLowerCase().contains(search.toLowerCase())) {
                        System.out.println("Book Found: " + book);
                        found = true;
                    }
                }

                if (!found)
                    System.out.println("Book Not Found");
            }
            else if (choice == 2) {
                System.out.println("Previous page displayed.");
            }
            else if (choice == 3) {
                System.out.println("Next page displayed.");
            }
            else if (choice == 4) {
                System.out.print("Enter book name to reserve: ");
                String book = sc.nextLine();
                System.out.println(book + " reserved successfully!");
            }
            else if (choice == 5) {
                break;
            }
        }

        sc.close();
    }
}
