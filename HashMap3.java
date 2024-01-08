import java.sql.SQLOutput;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("HashMap cua map la: " + map.entrySet());

        //compute
        map.compute("one", (key, value) -> 5);
        System.out.println("HashMap cua map sau khi thay doi compute la: " + map);

        //computeIfAbsent
        map.computeIfAbsent("four", value -> 4);
        System.out.println("HashMap cua map sau khi thay doi computeIfAbsent la: " + map);

        //computeIfPresent
        map.computeIfPresent("three", (key, value) -> value * 30);
        System.out.println("HashMap cua map sau khi thay doi computeIfPresent la: " + map);

        //constainKey
        System.out.println("Kiem tra xem co value la 3 khong:");
        test(map.containsValue(3));

        //merge
        map.merge("one", 8, (key, value) -> value * 3);
        System.out.println("HashMap cua map sau khi thay doi merge la: " + map);

        //for each
        System.out.print("Entries: ");
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            System.out.print(i);
            System.out.print(", ");
        }

        System.out.print("\nKey: ");
        for (String k : map.keySet()) {
            System.out.print(k);
            System.out.print(", ");
        }

        System.out.print("\nValues: ");
        for (Integer v : map.values()) {
            System.out.print(v);
            System.out.print(", ");
        }

        Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();
        System.out.println("\nHashMap cua map sau khi chay ham while la: " );
        while (mapIterator.hasNext()) {
            System.out.print(mapIterator.next());
            System.out.print(", ");
        }

        Iterator<String> mapIterator1 = map.keySet().iterator();
        System.out.println("\nKey cua HashMap cua map sau khi chay ham while la: " );
        while (mapIterator1.hasNext()) {
            System.out.print(mapIterator1.next());
            System.out.print(", ");
        }

        Iterator<Integer> mapIterator2 = map.values().iterator();
        System.out.println("\nKey cua HashMap cua map sau khi chay ham while la: " );
        while (mapIterator2.hasNext()) {
            System.out.print(mapIterator2.next());
            System.out.print(", ");
        }

    }

    public static void test (boolean a) {
        if (a) {
            System.out.println("Dung");
        } else {
            System.out.println("Khong");
        }
    }
}
