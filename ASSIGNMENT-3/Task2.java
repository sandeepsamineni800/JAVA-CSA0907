import java.io.IOException;

class ExamException extends Exception {
    ExamException(String message) {
        super(message);
    }

    ExamException(String message, Throwable cause) {
        super(message, cause);
    }
}

class SubmissionStorageException extends ExamException {
    SubmissionStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Storage {
    void save(String fileName, long sizeKb)
            throws SubmissionStorageException {

        try {
            if (sizeKb > 500) {
                throw new IOException("Disk quota exceeded");
            }

            System.out.println("Saved " + fileName);

        } catch (IOException e) {
            throw new SubmissionStorageException(
                "Could not store " + fileName, e);
        }
    }
}

class ExamService {
    void submit(String fileName, long size)
            throws ExamException {
        Storage storage = new Storage();
        storage.save(fileName, size);
    }
}

public class Task2 {
    public static void main(String[] args) {
        ExamService service = new ExamService();

        try {
            service.submit("answer01.pdf", 120);
            service.submit("answer02.pdf", 800);

        } catch (ExamException e) {
            System.out.println("Error: " + e.getMessage());

            System.out.println("Cause: " +
                e.getCause().getMessage());

            System.out.println("\nFull Stack Trace:");
            e.printStackTrace();
        }
    }
}
