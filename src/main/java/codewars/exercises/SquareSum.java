package codewars.exercises;
//Complete the square sum function so that it squares each number passed into it and then sums the results together.
//
//        For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.


import java.util.Arrays;
import java.util.Collections;

public class SquareSum {
    public static void main(String[] args) {


        int[] ints = {1,2,3};

        System.out.println(squareSum(ints));


    }

    public static int squareSum(int[] n){

        int sum=0;

        for (int i : n) {
            sum += i*i;
        }

        return sum;
    }
}