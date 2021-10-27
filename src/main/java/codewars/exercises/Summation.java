package codewars.exercises;
//Write a program that finds the summation of every number from 1 to num.
//        The number will always be a positive integer greater than 0.

public class Summation {
    public static void main(String[] args) {

        int test = 8;
        int test2 = 5;
        int test3 = 3;

        System.out.println(sum(test));
        System.out.println(sum(test2));
        System.out.println(sum(test3));

    }

    public static int sum(int i) {
        int e = 0;

        for (int j = 1; j < i; j++) {
            e = j + e;
        }

        e += i;

        return e;
    }
}
