package codewars.exercises;
//Implement a function that accepts 3 integer values a, b, c.
//        The function should return true if a triangle can be built with the sides of given length and false in any other case.
//
//        (In this case, all triangles must have surface greater than 0 to be accepted).

import java.util.ArrayList;
import java.util.Collections;

public class IsItTriangle {
    public static void main(String[] args) {


        System.out.println(triangleChecker(5, 8, 10));

    }

    public static boolean triangleChecker(int a, int b, int c) {

        boolean isTriangle = false;

        ArrayList<Integer> triangle = new ArrayList<>();

        triangle.add(a);
        triangle.add(b);
        triangle.add(c);

        Collections.sort(triangle);

        if (triangle.get(0) + triangle.get(1) >= triangle.get(2)) {
            isTriangle = true;
        }

        return isTriangle;

    }
}
