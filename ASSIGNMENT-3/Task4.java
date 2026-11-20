class ScannerStation extends Thread {

    private String stationName;
    private int scripts;

    ScannerStation(String name, int scripts) {
        stationName = name;
        this.scripts = scripts;
    }

    public void run() {
        try {
            System.out.println(stationName + " started");

            for (int i = 1; i <= scripts; i++) {
                System.out.println(stationName +
                    " scanned script " + i);

                Thread.sleep(500);
            }

            System.out.println(stationName +
                " completed " + scripts + " scripts");

        } catch (InterruptedException e) {
            System.out.println(stationName + " interrupted");
            Thread.currentThread().interrupt();
        }
    }
}

public class Task4 {
    public static void main(String[] args)
            throws InterruptedException {

        ScannerStation s1 = new ScannerStation("Station 1", 2);
        ScannerStation s2 = new ScannerStation("Station 2", 2);
        ScannerStation s3 = new ScannerStation("Station 3", 2);
        ScannerStation s4 = new ScannerStation("Station 4", 2);

        s1.start();
        s2.start();
        s3.start();
        s4.start();

        System.out.println("Station 1 Alive: " + s1.isAlive());

        s1.join();
        s2.join();
        s3.join();
        s4.join();

        System.out.println("All stations completed");
    }
}
