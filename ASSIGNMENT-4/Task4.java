import java.util.Scanner;
import java.util.ArrayList;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Point> points = new ArrayList<>();
        int count = 0;

        while (true) {
            System.out.println("\n--- DRAW PAD ---");
            System.out.println("1. Click");
            System.out.println("2. Display Points");
            System.out.println("3. Clear");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter X coordinate: ");
                int x = sc.nextInt();

                System.out.print("Enter Y coordinate: ");
                int y = sc.nextInt();

                points.add(new Point(x, y));
                count++;

                System.out.println("Dot Added!");
                System.out.println("Clicks: " + count);
            }
            else if (choice == 2) {
                System.out.println("Total Clicks: " + count);

                for (Point p : points) {
                    System.out.println("Point: (" + p.x + ", " + p.y + ")");
                }
            }
            else if (choice == 3) {
                points.clear();
                count = 0;
                System.out.println("Drawing Cleared!");
            }
            else if (choice == 4) {
                break;
            }
        }

        sc.close();
    }
}
