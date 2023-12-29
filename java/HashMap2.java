package java.javatester;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        System.out.println("Hashmap numbers: " + numbers);

        //using entrySet()
        System.out.println("Key/Value mapping: " + numbers.entrySet());

        //using keySet()
        System.out.println("Key mapping: " + numbers.keySet());

        //using values()
        System.out.println("Value mapping: " + numbers.values());

        //using get()
        System.out.println("Get mapping: " + numbers.get(1));

    }
}
