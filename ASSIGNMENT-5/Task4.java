import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args) {

        ArrayList<String[]> oldFile = new ArrayList<>();

        // Existing file records
        oldFile.add(new String[]{"P1001", "192311001",
                "Arun", "12", "4500"});

        oldFile.add(new String[]{"P1002", "192311002",
                "Divya", "7", "3800"});

        oldFile.add(new String[]{"P1003", "192311003",
                "Ravi", "5", "-200"});

        oldFile.add(new String[]{"P1004", "192311004",
                "Kiran", "ABC", "2500"});

        ArrayList<String[]> database = new ArrayList<>();
        ArrayList<String> errors = new ArrayList<>();

        // Migration
        for (String[] p : oldFile) {

            try {

                int route = Integer.parseInt(p[3]);
                double amount = Double.parseDouble(p[4]);

                if (route <= 0 || amount <= 0) {
                    throw new IllegalArgumentException();
                }

                database.add(p);

            } catch (Exception e) {

                errors.add(p[0] + " - Invalid record");
            }
        }

        // Display results
        System.out.println("Migration Completed");

        System.out.println("Valid records migrated: "
                + database.size());

        System.out.println("\nMigrated Records:");

        for (String[] p : database) {
            System.out.println(
                    p[0] + " " + p[1] + " "
                    + p[2] + " " + p[3] + " " + p[4]);
        }

        System.out.println("\nFailed Records:");

        for (String error : errors) {
            System.out.println(error);
        }
    }
}
