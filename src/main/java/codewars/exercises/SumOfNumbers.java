package codewars.exercises;
//Given two integers a and b, which can be positive or negative,
//        find the sum of all the integers between and including them and return it.
//        If the two numbers are equal return a or b.
//
//        Note: a and b are not ordered!


import java.util.stream.IntStream;

public class SumOfNumbers {
    public static void main(String[] args) {

        int a = 0;
        int b = -1;

        System.out.println(sumOfNumbers(a, b));

    }

    public static int sumOfNumbers(int a, int b) {
        int c;

        if (b < a) {
            c = IntStream.rangeClosed(b, a).sum();
        } else {
            c = IntStream.rangeClosed(a, b).sum();
        }
        return c;
    }
}
