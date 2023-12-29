import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    //study HashMap
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>() {
            {
                put(1, "one");
                put(2, "two");
            }
        };

        // tra ve gia tri cua map
        System.out.print("Cac gia tri cua map la: " + map + "\n");
        //{1=one, 2=two}

        System.out.println();

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(3, "three");
        myMap.put(4, "four");
        myMap.put(5, "five");
        
        System.out.println("Gia tri co key = 3 cua myMap la: " + myMap.get(3) + "\n");

        //tra ra cac gia tri cua key
        System.out.print("Cac key cua myMap la: ");
        for (Integer i : myMap.keySet()) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        //tra ra cac gia tri cua value
        System.out.print("Cac value cua myMap la: ");
        for (String i : myMap.values()) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        //tra ra cac gia tri cua key + value 
        System.out.println("Cac key va value cua myMap la: ");
        for (Integer i : myMap.keySet()) {
            System.out.println("key: " + i + ", value: " + myMap.get(i));
        }

        System.out.println("size = " + myMap.size());

        while (!myMap.isEmpty()) {
            System.out.println("size = " + myMap.size());
            myMap.clear();
        }
        
        System.out.println("size = " + myMap.size());
        
        System.out.println("Vong lap while");
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n");

        System.out.println("Vong lap do while");
        int n = 0;
        do {
            System.out.print(n + " ");
            n++;
        } while (n < 5);

        System.out.println("\n");

        System.out.println("Vong lap for each");
        String[] cars = {"BMW","Mercedes","Audi","Honda"};
        for (String c : cars) {
            System.out.print(c + " ");
        }
    }
}

