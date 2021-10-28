package codewars.exercises;

public class ExpandedForm {
    public static void main(String[] args) {

        int test= 1983;

        System.out.println(expanded(test));


    }

    public static String expanded(int i){

        String string = Integer.toString(i);

        String singlePart = "";

        String finalString = "";

        for (int j = 0; j < string.length(); j++) {

            StringBuilder zero = new StringBuilder("0");
            for (int k = 0; k < string.length()-j; k++) {
                zero.append("0");
            }

            singlePart = singlePart+ String.valueOf(string.charAt(j))  +zero;
        }

        finalString = finalString + " + "+singlePart;

        

        return finalString;
    }
}
