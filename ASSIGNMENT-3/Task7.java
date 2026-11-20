import java.util.concurrent.*;
import java.util.*;

class ResultProcessor implements Callable<String> {

    private String fileName;

    ResultProcessor(String fileName) {
        this.fileName = fileName;
    }

    public String call() throws Exception {

        // Simulate missing or corrupt files
        if (fileName.equals("missing")) {
            throw new Exception("File not found");
        }

        if (fileName.equals("corrupt")) {
            throw new Exception("Corrupt file");
        }

        return fileName + " - Result processed successfully";
    }
}

public class Task7 {

    public static void main(String[] args) {

        int success = 0;
        int failure = 0;

        ExecutorService executor =
            Executors.newFixedThreadPool(4);

        List<Future<String>> futures =
            new ArrayList<>();

        Queue<String> results =
            new ConcurrentLinkedQueue<>();

        String[] files = {
            "student1",
            "student2",
            "missing",
            "student3",
            "corrupt",
            "student4",
            "student5",
            "student6"
        };

        long start = System.currentTimeMillis();

        // Submit all files for processing
        for (String file : files) {
            futures.add(
                executor.submit(new ResultProcessor(file))
            );
        }

        // Collect results
        for (Future<String> future : futures) {

            try {
                String result = future.get();

                results.add(result);
                success++;

                System.out.println(result);

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
                failure++;

                System.out.println("Processing interrupted");

            } catch (ExecutionException e) {

                failure++;

                System.out.println("Failed: " +
                    e.getCause().getMessage());
            }
        }

        executor.shutdown();

        long end = System.currentTimeMillis();

        System.out.println("\n----- Final Summary -----");

        System.out.println("Total Files: " + files.length);
        System.out.println("Successful Files: " + success);
        System.out.println("Failed Files: " + failure);

        System.out.println("Total Time: " +
            (end - start) + " ms");

        System.out.println("Processing Completed");
    }
}

