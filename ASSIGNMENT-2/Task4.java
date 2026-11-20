import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> linkedMap = new LinkedHashMap<>();

        int[] codes = {103, 101, 105, 102, 104};

        for (int code : codes) {
            hashMap.put(code, "Medicine" + code);
            treeMap.put(code, "Medicine" + code);
            linkedMap.put(code, "Medicine" + code);
        }

        System.out.println("HashMap: " + hashMap);

        System.out.println("TreeMap: " + treeMap);

        System.out.println("LinkedHashMap: " + linkedMap);

        System.out.println("Medicine Lookup: " +
                           hashMap.get(103));

        System.out.println("Total Medicines: " +
                           hashMap.size());
    }
}
