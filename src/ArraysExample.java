import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }

        for (int ele : arr1) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // fill array with 0
        Arrays.fill(arr1, 0);
        for (int ele : arr1) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // fill array with 1 to 10
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        // Sort the array

        Arrays.sort(arr1);
        for (int ele : arr1) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // Sort the array in reverse order
        Integer[] arr2 = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        Arrays.sort(arr2, (a, b) -> b - a);

        for (int ele : arr2) {
            System.out.print(ele + " ");
        }
    }
}
