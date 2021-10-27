package codewars.exercises;

//Define a function that takes one integer argument and returns logical value true or false depending on if the integer is a prime.
//
//Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
//
//Requirements
//You can assume you will be given an integer input.
//You can not assume that the integer will be only positive. You may be given negative numbers as well (or 0).

public class IsItPrime {
    public static void main(String[] args) {

        int test1 = 4;
        int test2 = 5099;

        System.out.println(isPrime(test1));
        System.out.println(isPrime(test2));

    }


    public static boolean isPrime(int a) {

        boolean prime = false;
        int e = 0;

        if (a < 1) {
            return false;
        }

        for (int i = 1; i < a; i++) {

            if (a % i == 0 && i != 1) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }
}

