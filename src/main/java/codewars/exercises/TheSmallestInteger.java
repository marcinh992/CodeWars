package codewars.exercises;

import java.util.Arrays;

//Find the smallest integer in the array

public class TheSmallestInteger {
    public static void main(String[] args) {

        int[] ints = {44, 25, 1, 67};

        System.out.println(theSmallestInt(ints));

    }

    public static int theSmallestInt(int[] ints) {

        Arrays.sort(ints);

        return ints[0];

    }
}
