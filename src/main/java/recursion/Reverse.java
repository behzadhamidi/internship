package recursion;
public class Reverse {

public static String reverse(String input) {

    if (input.isEmpty()) {
        return input;
    } else {
        return reverse(input.substring(1)) + input.charAt(0);
    }
}}