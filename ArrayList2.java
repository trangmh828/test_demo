import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "cat");
        animals.add(1, "elephant");
        animals.add(2, "dog");
        animals.add(3, "elephant");
        System.out.println("Animals: " + animals);

        ArrayList<String> mammals = new ArrayList<>();
        mammals.add("dolphin");
        mammals.add("perry");

        animals.addAll(mammals);
        System.out.println("New Animals: " + animals);

        //create an array list
        ArrayList<String> animals1 = new ArrayList<>(Arrays.asList("meo", "ga", "cho"));
        System.out.println("Con vat : " + animals1);

        //access elemetns of the array list
        String element = animals1.get(1);
        System.out.println("Con vat o vi tri thu 2 la: " + element);

        //create an object of Iterator
        Iterator<String> iterate = animals1.iterator();
        System.out.print("ArrayList: ");

        //use the method to access the elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(" , ");
        }

        //change the element of the array list
        animals1.set(2, "voi");
        System.out.println("\nModified Arraylist: " + animals1);

        //remove
        String removeAnimal = animals1.remove(2);
        System.out.println("Remove Element: " + removeAnimal);
        System.out.println("Removed Arraylist: " + animals1);

        //removeAll, clear

        //Using for loop
        System.out.print("\nArrayList by for loop: ");
        for (int i = 0; i < animals.size(); i++) {
            System.out.print(animals.get(i) + ", ");
        }

        //Using for each loop
        System.out.print("\nArrayList by for each loop: ");
        for(String a : animals) {
            System.out.print(a + ", ");
        }

        //sort
        Collections.sort(animals);
        System.out.println("\nArray list after sorting: " + animals);

        //create a new array of String type
        String arr[] = new String[animals.size()];

        //convert ArrayList into an array
        animals.toArray(arr);

        System.out.print("\nArray: ");
        for(String i : arr) {
            System.out.print(i + ", ");
        }

        //create an array of String type
        String[] arrayAnimal = {"Dog", "Cat", "Horse", "Rabbit"};
        for(String i : arrayAnimal) {
            System.out.print(i + ", ");
        }

        //convert array to arraylist
        ArrayList<String> arrayToArrayList = new ArrayList<>(Arrays.asList(arrayAnimal));
        System.out.println("\nArray To ArrayList: " + arrayToArrayList);

        //convert arraylist to string
        String arrayListToString =  animals.toString();
        System.out.println("\nArrayList To String: " + arrayListToString);

        //contains
        String a = "Cat";
        if (arrayToArrayList.contains(a)) {
            System.out.println(a + " ton tai");
        } else {
            System.out.println(a + " khong ton tai");
        }
    }
}
