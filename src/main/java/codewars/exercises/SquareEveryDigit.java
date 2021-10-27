package codewars.exercises;

public class SquareEveryDigit {

//    Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//    For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//    Note: The function accepts an integer and returns an integer

    public static  Integer squareNumbers(Integer integer) {
         String result = "";

         while  (integer != 0){
             int singleNumber = integer%10;
             result = singleNumber * singleNumber + result;

             integer = integer/10;
         }

         return Integer.parseInt(result);
     }




    public static void main(String[] args) {
        System.out.println(squareNumbers(532));

        System.out.println(squareNumbers(0));

    }
}
