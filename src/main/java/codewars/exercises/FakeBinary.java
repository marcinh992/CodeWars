
//Given a string of digits, you should replace any digit below 5 with '0'
//        and any digit 5 and above with '1'. Return the resulting string.

package codewars.exercises;

public class FakeBinary {
    public static void main(String[] args) {

        String example = "8946428";

        System.out.println(binary(example));

    }

    public static String binary(String s){

        return s.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
