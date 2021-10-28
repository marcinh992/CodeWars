package codewars.exercises;

//You will be given an array and a limit value.
// You must check that all values in the array are below or equal to the limit value.
// If they are, return true. Else, return false.
//
//You can assume all values in the array are numbers

public class smallEnough {
    public static void main(String[] args) {

        int[] test1 = {1,2,3,4,5,6,7};
        int[] test2 = {1,2,3,4,5,6,9};
        int limit = 8;

        System.out.println(isItSmallEnough(test1, limit));
        System.out.println(isItSmallEnough(test2, limit));

    }

    public static boolean isItSmallEnough(int[] a, int limit){

        boolean isIt = true;

        for (int j : a) {
            if (j > limit) {
                isIt = false;
                break;
            }
        }

        return isIt;
    }
}
