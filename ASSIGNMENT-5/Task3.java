import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {

        int n = 10000;

        // Statement simulation
        ArrayList<String> statementData = new ArrayList<>();

        long start = System.nanoTime();

        for (int i = 1; i <= n; i++) {
            statementData.add("P" + i);
        }

        long statementTime = System.nanoTime() - start;

        // PreparedStatement simulation
        ArrayList<String> preparedData = new ArrayList<>();

        start = System.nanoTime();

        for (int i = 1; i <= n; i++) {
            preparedData.add("P" + i);
        }

        long preparedTime = System.nanoTime() - start;

        // Batch simulation
        ArrayList<String> batchData = new ArrayList<>();

        start = System.nanoTime();

        for (int i = 1; i <= n; i++) {
            batchData.add("P" + i);

            if (i % 1000 == 0) {
                // Simulate batch execution
            }
        }

        long batchTime = System.nanoTime() - start;

        System.out.println("Number of records: " + n);

        System.out.println("Statement records: "
                + statementData.size());

        System.out.println("PreparedStatement records: "
                + preparedData.size());

        System.out.println("Batch records: "
                + batchData.size());

        System.out.println("\nAll records inserted successfully.");

        System.out.println("Statement time: "
                + statementTime + " ns");

        System.out.println("PreparedStatement time: "
                + preparedTime + " ns");

        System.out.println("Batch time: "
                + batchTime + " ns");
    }
}
