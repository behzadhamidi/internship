package recursion;

import java.util.Scanner;

import static recursion.Reverse.reverse;

public class Recursion {

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




}
