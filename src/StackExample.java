import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());

        System.out.println(stack);

        System.out.println("Search 3: " + stack.search(3));

        System.out.println("Search 6: " + stack.search(6));
    }
}
