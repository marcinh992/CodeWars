package codewars.exercises;
//In this simple assignment you are given a number and have to make it negative.
//        But maybe the number is already negative?

public class ReturnNegative {
    public static void main(String[] args) {

        int i = 1;
        int a = -2;

        System.out.println(returnNegative(i));
        System.out.println(returnNegative(a));
    }

    public static int returnNegative(int i) {

        String negative = Integer.valueOf(i).toString();
        String minus = "-";

        if (!negative.startsWith("-")) {
            negative = minus + negative;
        }

        return Integer.parseInt(negative);
    }
}
