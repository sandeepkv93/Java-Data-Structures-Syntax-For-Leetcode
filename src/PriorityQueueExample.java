import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Similar way to create a max heap
        PriorityQueue<Integer> maxHeap2 = new PriorityQueue<>((a, b) -> b.compareTo(a));
        PriorityQueue<Integer> maxHeap3 = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        PriorityQueue<Integer> maxHeap4 = new PriorityQueue<>(Comparator.reverseOrder());

        minHeap.addAll(List.of(1, 2, 3, 4, 5));
        maxHeap.addAll(List.of(1, 2, 3, 4, 5));

        for (int ele : minHeap) {
            System.out.print(ele + " ");
        }

        System.out.println();

        for (int ele : maxHeap) {
            System.out.print(ele + " ");
        }

        System.out.println();

        System.out.println(minHeap.peek());
        System.out.println(maxHeap.peek());

        PriorityQueue<Integer> minHeap2 = new PriorityQueue<>();
        minHeap2.offer(1);
        minHeap2.offer(5);
        minHeap2.offer(3);
        minHeap2.offer(2);

        while (!minHeap2.isEmpty()) {
            System.out.print(minHeap2.poll() + " ");
        }

        System.out.println();
    }
}
