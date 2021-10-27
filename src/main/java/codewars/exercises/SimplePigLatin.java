package codewars.exercises;
//
//Move the first letter of each word to the end of it, then add "ay" to the end of the word.
//        Leave punctuation marks untouched.

public class SimplePigLatin {
    public static void main(String[] args) {

        String test1 = "Pig latin is cool";
        String test2 = "Hello world";

        System.out.println(pigIt(test1));
        System.out.println(pigIt(test2));


    }

    public static String pigIt(String s) {

        String[] parts = s.split(" ");
        String finalWord = "";

        for (int i = 0; i < parts.length; i++) {
            char c = parts[i].charAt(0);
            String substring = parts[i].substring(1);
            parts[i] = substring + c + "ay ";

            if (finalWord.equals("")) {
                finalWord = parts[i];
            } else {
                finalWord = finalWord + parts[i];
            }
        }
        return finalWord;
    }
}
