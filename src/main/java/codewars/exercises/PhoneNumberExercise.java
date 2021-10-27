package codewars.exercises;

import java.util.Arrays;

public class PhoneNumberExercise {

    //Napisz funkcje, która przyjmuje tablicę 10intów (między 0 a 9) i zwraca Stringa w formie numeru telefonu -->
//    (123) 456-7890 spacja ma znaczenie

    public static String phoneNumberCreator(int[] array){

        String pattern = "(xxx) xxx-xxxx";

        String s = Arrays.toString(array);


        for (int i = 0; i < array.length; i++) {

            char ch = s.charAt(i);

            pattern = pattern.replace('x', ch);
        }

        return pattern;
    }

    public static String phoneNumberCreator2(int[] numbers){
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }


    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,0};


        System.out.println(phoneNumberCreator(numbers));

        System.out.println(phoneNumberCreator2(numbers));





    }
}
