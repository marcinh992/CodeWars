package square_every_digit;

import codewars.exercises.SquareEveryDigit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareEveryDigitTest {

    @Test
    public void isSolutionWorksCorrectly(){
        assertEquals(811181, SquareEveryDigit.squareNumbers(9119));
        assertEquals(0, SquareEveryDigit.squareNumbers(0));
    }

}