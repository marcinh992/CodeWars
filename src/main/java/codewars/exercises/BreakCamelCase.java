package codewars.exercises;

//Complete the solution so that the function will break up camel casing, using a space between words.

public class BreakCamelCase {
    public static void main(String[] args) {

        String test1 = "camelCase";
        String test2 = "trzeciaWNocyToNocCzyJuzPoranek?";

        System.out.println(stringSplitter(test1));
        System.out.println(stringSplitter(test2));

    }

    public static String stringSplitter(String s) {

        String[] parts = s.split("(?=[A-Z])");
        String word = "";

        for (int i = 0; i < parts.length; i++) {
            if (word.equals("")) {
                word = parts[i];
            } else {
                word = word + " " + parts[i];
            }
        }
        return word;
    }
}
