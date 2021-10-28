package codewars.exercises;

import java.util.Arrays;

//Given a number , Return _The Maximum number _ could be formed from the digits of the number given .
//
//Notes
//Only Natural numbers passed to the function , numbers Contain digits [0:9] inclusive
//
//Digit Duplications could occur , So also consider it when forming the Largest

public class FromTheLargest {
    public static void main(String[] args) {

        long test = 12345;

        System.out.println(maxNumber(test));

    }

    public static long maxNumber(long n){
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        String maxString =" ";

        for (int i = 0; i < chars.length; i++) {
            maxString = maxString +chars[chars.length-i-1];
        }
        String s = maxString.replaceAll("\\s", "");

        return Long.parseLong(s);
    }
}
