public class StringExample {
    public static void main(String[] args) {
        // String is immutable
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        // Convert string to char array
        char[] charArray = str1.toCharArray();

        for (char ch : charArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        // Convert char array to string
        String str4 = new String(charArray);
        System.out.println(str4);

        // Convert string to byte array
        byte[] byteArray = str1.getBytes();

        for (byte b : byteArray) {
            System.out.print(b + " ");
        }

        System.out.println();

        // value at a specific index
        System.out.println("str1.charAt(0): " + str1.charAt(0));

        // Check if a string contains a substring
        System.out.println("str1.contains(\"ll\"): " + str1.contains("ll"));

        // Check if a string starts with a substring
        System.out.println("str1.startsWith(\"He\"): " + str1.startsWith("He"));

        // Check if a string ends with a substring
        System.out.println("str1.endsWith(\"lo\"): " + str1.endsWith("lo"));

        // Check if a string is empty
        System.out.println("str1.isEmpty(): " + str1.isEmpty());

        // Convert a string to uppercase
        String str5 = new String("hello");
        System.out.println("hello.toUpperCase(): " + str5.toUpperCase());

        // Convert a string to lowercase
        System.out.println("HELLO.toLowerCase(): " + str5.toLowerCase());

        // Replace all characters in a string with another character
        System.out.println("str1.replace('l', 'p'): " + str1.replace('l', 'p'));

        // Concatenate two strings
        String str6 = "World";
        String str7 = "Hello";
        System.out.println("str7.concat(str6): " + str7.concat(str6));

        // Check if a character is a digit
        System.out.println("Character.isDigit('1'): " + Character.isDigit('1'));

        // Check if a character is a letter
        System.out.println("Character.isLetter('a'): " + Character.isLetter('a'));

        // Check if a character is a letter or digit
        System.out.println("Character.isLetterOrDigit('a'): " + Character.isLetterOrDigit('a'));

        // Check if a character is a whitespace
        System.out.println("Character.isWhitespace(' '): " + Character.isWhitespace(' '));

        // Check if a character is uppercase
        System.out.println("Character.isUpperCase('A'): " + Character.isUpperCase('A'));

        // Check if a character is lowercase
        System.out.println("Character.isLowerCase('a'): " + Character.isLowerCase('a'));

        // Convert a character to uppercase
        System.out.println("Character.toUpperCase('a'): " + Character.toUpperCase('a'));

        // Convert a character to lowercase
        System.out.println("Character.toLowerCase('A'): " + Character.toLowerCase('A'));

        // Convert a string to an integer
        String str8 = "123";
        int num = Integer.parseInt(str8);

        // Convert an integer to a string
        String str9 = String.valueOf(num);

        // Convert a string to a double
        String str10 = "123.45";
        double d = Double.parseDouble(str10);

        // Convert a double to a string
        String str11 = String.valueOf(d);

        Character.isMirrored('a');
    }
}
