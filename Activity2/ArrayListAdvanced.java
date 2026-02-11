package Activity2;



import java.util.*;

public class ArrayListAdvanced {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Store 10 numbers
        list.addAll(Arrays.asList(10, 25, 30, 45, 60, 5, 90, 12, 7, 18));

        // Remove all even numbers
        list.removeIf(n -> n % 2 == 0);

        // Find max and min
        int max = Collections.max(list);
        int min = Collections.min(list);

        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());

        // Display result
        System.out.println("Final List: " + list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
