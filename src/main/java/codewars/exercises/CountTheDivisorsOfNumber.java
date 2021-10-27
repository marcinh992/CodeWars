package codewars.exercises;

//Count the number of divisors of a positive integer n.

public class CountTheDivisorsOfNumber {
    public static void main(String[] args) {

        int test = 30;

        System.out.println(divisors(test));

    }

    public static int divisors(int a) {

        int counter = 1;

        for (int i = 1; i < a; i++) {

            if (a % i == 0) {
                counter++;
            }

        }
        return counter;
    }
}

