import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        int n = 10000;

        ArrayList<Integer> a = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();

        long start, end;

        // ArrayList insertion
        start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            a.add(i);
        }

        end = System.nanoTime();
        System.out.println("ArrayList Add: " + (end - start) + " ns");

        // LinkedList insertion
        start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        end = System.nanoTime();
        System.out.println("LinkedList Add: " + (end - start) + " ns");

        // ArrayList access
        start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            a.get(i);
        }

        end = System.nanoTime();
        System.out.println("ArrayList Access: " + (end - start) + " ns");

        // LinkedList access
        start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            l.get(i);
        }

        end = System.nanoTime();
        System.out.println("LinkedList Access: " + (end - start) + " ns");

        // Front insertion
        a.add(0, 100);
        l.add(0, 100);

        System.out.println("ArrayList Size: " + a.size());
        System.out.println("LinkedList Size: " + l.size());
    }
}
