package testamir;

import java.util.Scanner;

public class ReverseWordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the text: ");
        String text = scanner.nextLine();


        System.out.print("Enter the word to check: ");
        String word = scanner.nextLine();

        String reversedWord = reverse(word);

        if (text.contains(reversedWord)) {
            System.out.println("The reversed word \"" + reversedWord + "\" is found in the text.");
        } else {
            System.out.println("The reversed word \"" + reversedWord + "\" is not found in the text.");
        }

        scanner.close();
    }


    public static String reverse(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
