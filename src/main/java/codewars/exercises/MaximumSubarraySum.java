package codewars.exercises;


//The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
//
//Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
//// should be 6: {4, -1, 2, 1}
//Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
// If the list is made up of only negative numbers, return 0 instead.
//
//Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.


//NOT DONE  CORRECTLY! ! ! !

public class MaximumSubarraySum {
    public static void main(String[] args) {

        int[] test1 = {3, 4, -5, 14, 6, 12};

        System.out.println(maxSequence(test1));
        System.out.println(maxSequence2(test1));

    }

    //not correctly working
    public static int maxSequence(int[] ints) {

        int temporaryMaxSum = 0;
        int finalMaxSum = 0;

        for (int i = 0; i < ints.length; i++) {

            if (temporaryMaxSum <= temporaryMaxSum + ints[i]) {

                temporaryMaxSum = temporaryMaxSum + ints[i];

            } else {

                finalMaxSum = temporaryMaxSum;
                temporaryMaxSum = 0;
            }
        }

        if (temporaryMaxSum > finalMaxSum) {
            finalMaxSum = temporaryMaxSum;
        }

        return finalMaxSum;
    }


    //correctly working
    public static int maxSequence2(int[] ints) {

       int finalSum = 0;
       int temporarySum = 0;

       if (ints.length == 0){
           return 0;
       }

        for (int anInt : ints) {

            temporarySum = Math.max(anInt, temporarySum + anInt);
            finalSum = Math.max(finalSum, temporarySum);
        }

        return finalSum;
    }
}
