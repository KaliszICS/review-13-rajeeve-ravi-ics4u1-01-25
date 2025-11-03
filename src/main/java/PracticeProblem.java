import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
public class PracticeProblem {

	public static void main(String args[]) {
        // Test swap
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        System.out.println("\nBefore swap: " + fruits);
        swap(fruits, 1, 3);
        System.out.println("After swap(1, 3): " + fruits);

        // Test createArrayList
        double[] doubleArray = {1.5, 2.7, 3.9, 4.2, 5.1};
        ArrayList<Double> doubleList = createArrayList(doubleArray);
        System.out.println("\ncreateArrayList result: " + doubleList);

        // Test combineParallelArrays
        String[] peopleNames = {"Alice", "Bob", "Charlie", "Diana"};
        int[] peopleAges = {25, 30, 35, 28};
        HashMap<String, Integer> ageMap = combineParallelArrays(peopleNames, peopleAges);
        System.out.println("\ncombineParallelArrays result: " + ageMap);

        // Test increaseAge
        System.out.println("Bob's age before: " + ageMap.get("Bob"));
        increaseAge(ageMap, "Bob");
        System.out.println("Bob's age after increaseAge: " + ageMap.get("Bob"));
    }

    // Creates an integer array with values 1-5 using a loop
    public static int[] createIntArray() {
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // Creates a String array from four String parameters
    public static String[] createArray(String str1, String str2, String str3, String str4) {
        String[] array = new String[4];
        array[0] = str1;
        array[1] = str2;
        array[2] = str3;
        array[3] = str4;
        return array;
    }

    // Finds the index of the first occurrence of a value in an integer array
    public static int findValue(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Finds the index of the third occurrence of a String in a String array
    public static int findThirdValue(String value, String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                count++;
                if (count == 3) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Checks if a word is a palindrome (case insensitive, ignoring spaces)
    public static boolean isPalindrome(String word) {
        // Remove spaces and convert to lowercase
        String cleaned = word.replace(" ", "").toLowerCase();

        // Check if the string reads the same forwards and backwards
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Returns the age associated with a name from parallel arrays
    public static int getAge(String[] names, int[] ages, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return ages[i];
            }
        }
        return -1; // Return -1 if name not found
    }

    // Counts how many words in the string contain the given character
    public static int countWords(String text, char letter) {
        // Split the string into words
        String[] words = text.split(" ");
        int count = 0;

        // Check each word for the character
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == letter) {
                    count++;
                    break; // Found the letter in this word, move to next word
                }
            }
        }

        return count;
    }

    // Swaps two elements in an ArrayList at the given indexes
    public static void swap(ArrayList<String> list, int index1, int index2) {
        String temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    // Creates an ArrayList from an array of doubles
    public static ArrayList<Double> createArrayList(double[] array) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }

    // Combines parallel arrays into a HashMap
    public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], ages[i]);
        }
        return map;
    }

    // Increases the age associated with a name in the HashMap by one
    public static void increaseAge(HashMap<String, Integer> map, String name) {
        if (map.containsKey(name)) {
            int currentAge = map.get(name);
            map.put(name, currentAge + 1);
        }
    }
}
