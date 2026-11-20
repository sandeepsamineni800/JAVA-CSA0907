public class Task2 {

    public static void main(String[] args) {

        String correctId = "admin";
        String correctPwd = "1234";

        String enteredId = "admin";
        String enteredPwd = "' OR '1'='1";

        // Unsafe login
        String sql = "SELECT * FROM users WHERE id='"
                + enteredId + "' AND pwd='" + enteredPwd + "'";

        System.out.println("Unsafe SQL:");
        System.out.println(sql);

        if (sql.contains("' OR '1'='1")) {
            System.out.println("Unsafe Login: Accepted");
        } else {
            System.out.println("Unsafe Login: Rejected");
        }

        // Safe login simulation
        boolean safeLogin = enteredId.equals(correctId)
                && enteredPwd.equals(correctPwd);

        System.out.println("\nPreparedStatement Login:");

        if (safeLogin) {
            System.out.println("Login Accepted");
        } else {
            System.out.println("Login Rejected");
        }
    }
}
