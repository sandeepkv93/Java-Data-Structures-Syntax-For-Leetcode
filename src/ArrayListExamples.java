import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        for (int ele : list1) {
            System.out.print(ele + " ");
        }

        System.out.println();

        //set element in index 1 to 10
        list1.set(1, 10);

        System.out.println("Element at index 1: " + list1.get(1));

        // Find the index of 10
        System.out.println("Index of 10: " + list1.indexOf(10));

        // Check if 10 is present in the list
        System.out.println("Is 10 present in the list: " + list1.contains(10));

        // Find the size of the list
        System.out.println("Size of the list: " + list1.size());

        // Remove element at index 1
        list1.remove(1);

        // print the list
        for (int ele : list1) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // Remove element 3
        list1.remove(Integer.valueOf(3));

        // print the list
        for (int ele : list1) {
            System.out.print(ele + " ");
        }

        System.out.println();
    }
}
