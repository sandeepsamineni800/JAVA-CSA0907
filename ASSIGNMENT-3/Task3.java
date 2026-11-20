import java.io.*;

public class Task3 {
    public static void main(String[] args) {

        // Create sample input files
        try {
            FileWriter f1 = new FileWriter("store1.txt");
            f1.write("1000\n2000\n");
            f1.close();

            FileWriter f2 = new FileWriter("store2.txt");
            f2.write("3000\n4000\n");
            f2.close();

        } catch (IOException e) {
            System.out.println("File creation error");
        }

        int total = 0;

        // Try-with-resources
        try (
            BufferedReader br1 = new BufferedReader(
                new FileReader("store1.txt"));

            BufferedReader br2 = new BufferedReader(
                new FileReader("store2.txt"))
        ) {
            String line;

            while ((line = br1.readLine()) != null) {
                total += Integer.parseInt(line);
            }

            while ((line = br2.readLine()) != null) {
                total += Integer.parseInt(line);
            }

            System.out.println("Sales Report Generated");
            System.out.println("Total Sales: " + total);

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Invalid sales data");

        } finally {
            System.out.println("Report processing completed");
        }
    }
}
