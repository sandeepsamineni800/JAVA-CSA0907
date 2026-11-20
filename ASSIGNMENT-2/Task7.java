import java.util.*;

public class Task7 {
    public static void main(String[] args) {

        int n = 10000;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        long start, end;
 
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            list.add(0, i);
        }
        end = System.nanoTime();
        long arrayListTime = end - start; 
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            deque.addFirst(i);
        }

        end = System.nanoTime();

        long dequeTime = end - start;

        System.out.println("Original ArrayList Time: "
                           + arrayListTime + " ns");

        System.out.println("Redesigned ArrayDeque Time: "
                           + dequeTime + " ns");

        System.out.println("Original Size: " + list.size());

        System.out.println("Redesigned Size: " + deque.size());

        System.out.println("First Element in ArrayList: "
                           + list.get(0));

        System.out.println("First Element in ArrayDeque: "
                           + deque.peekFirst());
    }
}
