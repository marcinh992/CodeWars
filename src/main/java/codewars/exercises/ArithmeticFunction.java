package codewars.exercises;

//Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.
//
//a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.
//
//The four operators are "add", "subtract", "divide", "multiply".

public class ArithmeticFunction {
    public static void main(String[] args) {

        int a = 10;
        int b = 7;
        String operator = "add";

        System.out.println(arithmetic(a,b,operator));

    }

    public static String  arithmetic(int a, int b, String operator){

        int c = 0;

        if (operator.equalsIgnoreCase("add")){
            c = a+b;
        }
        if (operator.equalsIgnoreCase("subtract")){
            c = a-b;
        }
        if (operator.equalsIgnoreCase("multiply")){
            c = a*b;
        }
        if (operator.equalsIgnoreCase("divide")){
            c = a/b;
        }

        return Integer.toString(c);
    }
}
