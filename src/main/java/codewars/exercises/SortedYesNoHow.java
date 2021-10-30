package codewars.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Complete the method which accepts an array of integers, and returns one of the following:
//
//"yes, ascending" - if the numbers in the array are sorted in an ascending order
//"yes, descending" - if the numbers in the array are sorted in a descending order

//You can assume the array will always be valid, and there will always be one correct answer.

public class SortedYesNoHow {
    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5, 6};
        int[] test2 = {9, 5, 4, 2, 1};

        System.out.println(isSortedAndHow(test));
        System.out.println(isSortedAndHow(test2));


    }

    public static String isSortedAndHow(int[] arr) {

        int[] ints = Arrays
                .stream(arr)
                .sorted()
                .toArray();

        if (Arrays.equals(arr, ints)) {
            return "yes,asc";
        } else {
            return "no,dsc";
        }
    }
}
