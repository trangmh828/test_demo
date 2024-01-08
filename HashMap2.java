
import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        System.out.println("Hashmap numbers: " + numbers);


        //creating a hashmap from other map
        HashMap<Integer, String> newNumbers = new HashMap<>(numbers);
        newNumbers.put(4, "Four");
        System.out.println("New maps: " + newNumbers);

        //using entrySet()
        System.out.println("Key/Value mapping: " + numbers.entrySet());

        //using keySet()
        System.out.println("Key mapping: " + numbers.keySet());

        //using values()
        System.out.println("Value mapping: " + numbers.values());

        //using get()
        System.out.println("Get mapping: " + numbers.get(1));

        //Using getOrDefault()
        System.out.println("Get or default: " + numbers.getOrDefault(5, "Five"));

       //Using remove()
        HashMap<Integer, String> numbersRemove = new HashMap<>(newNumbers);
        System.out.println("Truoc khi remove: " + numbersRemove.entrySet());
        numbersRemove.remove(1);
        numbersRemove.remove(4, "Four");
        System.out.println("Sau khi remove: " + numbersRemove.entrySet());

        //Using replace
        HashMap<Integer, String> numbersReplace = new HashMap<>(newNumbers);
        System.out.println("Truoc khi replace: " + numbersReplace.entrySet());
        numbersReplace.replace(2, "Lexus");
        numbersReplace.replace(3, "Three", "five");
        System.out.println("Sau khi replace: " + numbersReplace.entrySet());
        numbersReplace.replaceAll((key, value) -> "after replace " + value);
        System.out.println("Sau khi replace all: " + numbersReplace.entrySet());

        //Using compute()
        HashMap<String, Integer> numbersCompute = new HashMap<>();
        numbersCompute.put("One", 1);
        numbersCompute.put("Two", 2);
        numbersCompute.put("Three", 3);
        numbersCompute.compute("One", (key, value) -> value + 1);
        System.out.println("Sau khi compute: " + numbersCompute.entrySet());
    }
}
