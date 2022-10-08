public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println(sb);

        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        System.out.println("Before setCharAt: " + sb);
        sb.setCharAt(5, '-');
        System.out.println("After setCharAt: " + sb);

        System.out.println("Before reverse: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Before replace: " + sb);
        sb.replace(0, 5, "Hello");
        System.out.println("After replace: " + sb);

        System.out.println("Before setLength: " + sb);
        sb.setLength(5);
        System.out.println("After setLength: " + sb);

        System.out.println("Before deleteCharAt: " + sb);
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt: " + sb);

        // Convert StringBuilder to String
        String str = sb.toString();
        System.out.println("String: " + str);

        // Convert String to StringBuilder
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println("StringBuilder: " + sb2);

        // Convert StringBuilder to String and then to char array
        char[] arr = sb.toString().toCharArray();

        for (char ch : arr) {
            System.out.print(ch + " ");
        }

        System.out.println();

        // Convert char array to String and then to StringBuilder
        StringBuilder sb3 = new StringBuilder(new String(arr));
        System.out.println("StringBuilder: " + sb3);
    }
}
