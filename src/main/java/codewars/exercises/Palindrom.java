package codewars.exercises;

public class Palindrom {

    //troche mniej szybko
    //brzydki kod ale działa także na zdania
    public static void palindromeCheckerv2(String s) {

        StringBuilder s1 = new StringBuilder();

        s1.append(s);

        String s2 = s1.reverse().toString();

        if (s2.replaceAll("\\s", "").equalsIgnoreCase(s.replaceAll("\\s", ""))) {
            System.out.println("v2.String jest palindromem");
        } else {
            System.out.println("v2.String nie jest palindromem");
        }
    }


    public static void main(String[] args) {


        palindromeCheckerv2("Ada bąki piką bada");

        palindromeCheckerv2("marcin");

    }
}
