package codewars.exercises;

//The word i18n is a common abbreviation of internationalization in the developer community,
// used instead of typing the whole word and trying to spell it correctly. Similarly,
// a11y is an abbreviation of accessibility.
//
//Write a function that takes a string and turns any and all "words" (see below) within that string of length 4
// or greater into an abbreviation, following these rules:
//
//A "word" is a sequence of alphabetical characters. By this definition, any other character like a space
// or hyphen (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
//The abbreviated version of the word should have the first letter, then the number of removed characters,
// then the last letter (eg. "elephant ride" => "e6t r2e").

public class Abbreviation {
    public static void main(String[] args) {

        String test1 = "tekstylia";
        String test2 = "Kot koloru kolorowego";

        System.out.println(a10n(test1));
        System.out.println(a10n(test2));

    }

    public static String a10n(String s) {
        StringBuilder finalString = new StringBuilder();

        String[] stringArr = s.split(" ");

        for (String value : stringArr) {

            if (value.length() > 3) {
                char firstStringChar = value.charAt(0);
                char lastStringChar = value.charAt(value.length() - 1);
                String stringMiddleSection = String.valueOf(value.length() - 2);
                String part = firstStringChar + stringMiddleSection + lastStringChar;
                finalString.append(" ").append(part);
            } else {
                finalString = new StringBuilder(value + " ");
            }
        }
        return finalString.toString();
    }
}

