package create_phone_number;

import codewars.exercises.PhoneNumberExercise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberExerciseTest {

    @Test
    public void isSolutionWorkCorrectly(){
        assertEquals("(123) 456-7890", PhoneNumberExercise.phoneNumberCreator2(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

}