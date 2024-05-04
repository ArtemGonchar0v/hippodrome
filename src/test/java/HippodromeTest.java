import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HippodromeTest {

    @Test
    void testHippodromeConstructorForNullIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new Hippodrome(null));
    }

    @Test
    void testHippodromeConstructorForNullIllegalArgumentExceptionMessage() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> new Hippodrome(null));
        String expectedMessage = "Horses cannot be null.";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testHippodromeConstructorForEmptyIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new Hippodrome(new ArrayList<>()));
    }

    @Test
    void testHippodromeConstructorForEmptyIllegalArgumentExceptionMessage() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> new Hippodrome(new ArrayList<>()));
        String expectedMessage = "Horses cannot be empty.";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}