import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>(10);
        ArrayList<Integer> integerArrayList1 = new ArrayList<>(integerArrayList);
        //stringArrayList co the chua 10 element
        stringArrayList.ensureCapacity(10);

        stringArrayList.add("Test 1");
        stringArrayList.add("Test 2");
        stringArrayList.add("Test 3");
        stringArrayList.add("Test 3");

        //reduce ?
        stringArrayList.trimToSize();

        System.out.println(stringArrayList.size());

        integerArrayList.add(1);
        integerArrayList.add(2);

        //size()
        System.out.println(integerArrayList);
        System.out.println(integerArrayList1.size());

        //contains()
        System.out.println(integerArrayList.contains(3));

        //indexOf()
        System.out.println("\n" + stringArrayList);
        System.out.println(stringArrayList.indexOf("Test 3"));
        System.out.println(stringArrayList.lastIndexOf("Test 3"));

        //toArray()
        Object[] array = stringArrayList.toArray();
        System.out.print("Output: ");
        for (Object i : array) {
            System.out.print(i + " ");
        }

        //get()
        System.out.println("\nOutput - get(2): " + stringArrayList.get(2));

        //set()
        System.out.println("\nOutput - set(1, 'Test 2 -1'): change " + stringArrayList.get(1) + " to ");
        stringArrayList.set(1, "Test 2 - 1");
        System.out.print(stringArrayList.get(1));

        //add()
        stringArrayList.add(1, "new Test 2");
        System.out.println("\nOutput - add(1, 'new Test 2'): " + stringArrayList);

        //remove()
        System.out.println("\nList: " + stringArrayList);
        stringArrayList.remove(2);
        System.out.println("\nOutput - remove(2): " + stringArrayList);
        stringArrayList.remove("Test 3");
        System.out.println("\nOutput - remove('Test 3'): " + stringArrayList);

        //clear()
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("List (before): " + arrayList);
        arrayList.clear();
        System.out.println("List (after): " + arrayList);

        //addAll
        ArrayList<String> stringArrayList1 = new ArrayList<>();
        stringArrayList1.add("1");
        stringArrayList1.add("3");
        stringArrayList1.add("2");
        stringArrayList1.add("4");

        stringArrayList.addAll(1, stringArrayList1);
        System.out.println(stringArrayList);

        Collections.sort(stringArrayList1);
        System.out.println("List sau khi sort (Integer): " + stringArrayList1);

        Collections.sort(stringArrayList);
        System.out.println("List sau khi sort (String): " + stringArrayList);

    }
}
