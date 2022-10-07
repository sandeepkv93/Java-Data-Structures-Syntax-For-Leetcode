import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Poll: " + queue.poll());

        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        System.out.println();
    }
}
