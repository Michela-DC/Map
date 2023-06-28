//Define a testing class with a main() method where you:
//    create an HashMap that maps the numbers from 1 to 5 with their respective English names
//    create an HashMap that maps the odd number from 1 to 9 with their respective Italian names
//    merge (without using merge()) the second hashmap into the first one (duplicate keys' values are overwritten in the first HashMap)
//    print the modified firstHashMap
//    print on screen the value of the keys 5, 6, 7, 8 and 9
//    if there's no mapping for a specific key, print No associated value

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");

        Map<Integer, String> oddNumbers = new HashMap<>();
        oddNumbers.put(1, "uno");
        oddNumbers.put(3, "tree");
        oddNumbers.put(5, "cinque");
        oddNumbers.put(7, "sette");
        oddNumbers.put(9, "nove");

        numbers.putAll(oddNumbers);

        // Stampo sia key che valore
        for(Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry);
        }

        System.out.println(" ");

        int[] fiveToNine = {5, 6, 7, 8, 9};

        for(int key : fiveToNine) {
            numbers.putIfAbsent(key, "No associated value");
        }

        for(Map.Entry<Integer, String> entry : numbers.entrySet()) {
            if(entry.getKey() >= 5) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        // Solo print della key
//        for(Integer key : numbers.keySet()) {
//            System.out.println(key);
//        }

        // Solo print dei value
//        for(String value : numbers.values()) {
//            System.out.println(value);
//        }
    }
}