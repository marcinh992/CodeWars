package codewars.exercises;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println(fizzBuzz(3));

        System.out.println(fizzBuzz(5));

        System.out.println(fizzBuzz(10));
      System.out.println(fizzBuzz(15));

        System.out.println(fizzBuzz(2));




    }

    public static String fizzBuzz(Integer i) {

        String result = "";

        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result = i.toString();
        }

        return result;
    }
}
