package codewars.exercises;
import java.util.Arrays;

//Return the number (count) of vowels in the given string.
//
//We will consider a, e, i, o, u as vowels for this Kata (but not y).
//
//The input string will only consist of lower case letters and/or spaces.

public class VowelCount {
    public static void main(String[] args) {

        String test = "kolaboracja";

        System.out.println(getCount(test));

    }

    public static int getCount(String s){
        int count = 0;

        String[] vowels = {"e","a","i","o","u"};

        for (int i = 0; i < s.length(); i++) {

            if (Arrays.asList(vowels).contains(String.valueOf(s.charAt(i)))){
                count++;
            }
        }
        return count;
    }
}
