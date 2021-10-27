package codewars.exercises;

//Several people are standing in a row divided into two teams.
//The first person goes into team 1, the second goes into team 2, the third goes into team 1, and so on.

//Given an array of positive integers (the weights of the people), return a new array/tuple of two integers,
// where the first one is the total weight of team 1, and the second one is the total weight of team 2.

import java.util.Arrays;

public class RowWeights {
    public static void main(String[] args) {

        int[] weights = {56, 90, 75, 67, 101, 34, 87};

        //1st = 319
        //2nd = 191

        System.out.println(Arrays.toString(weight(weights)));

    }

    public static int[] weight(int[] ints) {

        int team1 = 0;
        int team2 = 0;

        int loopCount = 1;

        for (int anInt : ints) {

            if (loopCount % 2 == 0) {
                team2 = team2 + anInt;
                loopCount++;
            } else {
                team1 = team1 + anInt;
                loopCount++;
            }
        }
        return new int[]{team1, team2};
    }

}
