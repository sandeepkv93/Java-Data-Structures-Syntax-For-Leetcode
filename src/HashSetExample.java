import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(2);

        for (int ele : set1) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // Find Set Union
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        set1.addAll(set2);
        for (int ele : set1) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // Find Set Intersection
        Set<Integer> set3 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set4 = Set.of(2, 3, 4, 5, 6);
        set3.retainAll(set4);

        for (int ele : set3) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // Find Set Difference
        Set<Integer> set5 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set6 = Set.of(2, 3, 4, 5, 6);
        set5.removeAll(set6);

        for (int ele : set5) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // Find Set Symmetric Difference
        Set<Integer> set7 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set8 = Set.of(2, 3, 4, 5, 6);
        set7.addAll(set8);
        Set<Integer> set9 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set10 = Set.of(2, 3, 4, 5, 6);
        set9.retainAll(set10);
        set7.removeAll(set9);

        for (int ele : set7) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // Find Set Subset
        Set<Integer> set11 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set12 = Set.of(2, 3, 4);
        System.out.println(set11.containsAll(set12));

        // Check if two sets are disjoint
        Set<Integer> set13 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set14 = Set.of(6, 7, 8);
        System.out.println(set13.stream().noneMatch(set14::contains));

        // Check if two sets are equal
        Set<Integer> set15 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set16 = Set.of(1, 2, 3, 4, 5);
        System.out.println(set15.equals(set16));

        // Check if any element is present in the set
        Set<Integer> set17 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        System.out.println(set17.contains(4));
    }
}
