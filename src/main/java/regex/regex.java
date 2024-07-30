package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        String text = "Contact us at 123-456-7890 or email us at behzadhamidi@example.com. " +
                "Alternatively, reach out to 987-654-3210.";


        Pattern phonePattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher phoneMatcher = phonePattern.matcher(text);


        System.out.println("Phone numbers found:");
        while (phoneMatcher.find()) {
            System.out.println("Found phone number: " + phoneMatcher.group());
        }


        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@gmail\\.com\\b");
        Matcher emailMatcher = emailPattern.matcher(text);


        System.out.println("\nEmail addresses found:");
        while (emailMatcher.find()) {
            System.out.println("Found email address: " + emailMatcher.group());
        }


        boolean allPhonesMatch = phonePattern.matcher(text).find();
        boolean allEmailsMatch = emailPattern.matcher(text).find();
        System.out.println("\nContains phone numbers: " + allPhonesMatch);
        System.out.println("Contains email addresses: " + allEmailsMatch);


        String updatedText = phoneMatcher.replaceAll("PHONE_NUMBER_REPLACED");
        System.out.println("\nText after replacing phone numbers:");
        System.out.println(updatedText);


        String[] splitText = updatedText.split("\\s+");
        System.out.println("\nText split by spaces:");
        for (String part : splitText) {
            System.out.println("Part: " + part);
        }
    }
}
