package strings;

public class Strings {
    public static void main(String[] args) {
        String str = "Hello, World!";

        int length = str.length();
        System.out.println("Length: " + length);

        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);

        String lowerCase = str.toLowerCase();
        System.out.println("Lower case: " + lowerCase);

        String upperCase = str.toUpperCase();
        System.out.println("Upper case: " + upperCase);

        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);

        String replacedStr = str.replace('o', 'a');
        System.out.println("Replaced 'o' with 'a': " + replacedStr);


        String strWithSpaces = "   Hello, World!   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed: '" + trimmedStr + "'");


        boolean isEqual = str.equals("Hello, World!");
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("Is equal: " + isEqual);
        System.out.println("Is equal ignoring case: " + isEqualIgnoreCase);
    }
}
