import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HippodromeTest {
    private final List<Horse> horses = new ArrayList<>(Arrays.asList(
            new Horse("horse1", 10, 1000),
            new Horse("horse2", 10, 100),
            new Horse("horse3", 10, 100),
            new Horse("horse4", 10, 100),
            new Horse("horse5", 10, 100),
            new Horse("horse6", 10, 100),
            new Horse("horse7", 10, 100),
            new Horse("horse8", 10, 100),
            new Horse("horse9", 10, 100),
            new Horse("horse10", 10, 100),
            new Horse("horse11", 10, 100),
            new Horse("horse12", 10, 100),
            new Horse("horse13", 10, 100),
            new Horse("horse14", 10, 100),
            new Horse("horse15", 10, 100),
            new Horse("horse16", 10, 100),
            new Horse("horse17", 10, 100),
            new Horse("horse18", 10, 100),
            new Horse("horse19", 10, 100),
            new Horse("horse20", 10, 100),
            new Horse("horse21", 10, 100),
            new Horse("horse22", 10, 100),
            new Horse("horse23", 10, 100),
            new Horse("horse24", 10, 100),
            new Horse("horse25", 10, 100),
            new Horse("horse26", 10, 100),
            new Horse("horse27", 10, 100),
            new Horse("horse28", 10, 100),
            new Horse("horse29", 10, 100),
            new Horse("horse30", 10, 100)
    ));
    private final List<Horse> mockHorses = new ArrayList<>(Arrays.asList(
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class),
            mock(Horse.class)
    ));

    @Test
    void testHippodromeConstructorForNullIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Hippodrome(null));
    }

    @Test
    void testHippodromeConstructorForNullIllegalArgumentExceptionMessage() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Hippodrome(null));
        String expectedMessage = "Horses cannot be null.";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testHippodromeConstructorForEmptyIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Hippodrome(new ArrayList<>()));
    }

    @Test
    void testHippodromeConstructorForEmptyIllegalArgumentExceptionMessage() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Hippodrome(new ArrayList<>()));
        String expectedMessage = "Horses cannot be empty.";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testGetHorses() {
        Hippodrome hippodrome = new Hippodrome(horses);
        Assertions.assertEquals(hippodrome.getHorses(), horses);
    }

    @Test
    void testMoveVerification() {
        Hippodrome hippodrome = new Hippodrome(mockHorses);
        hippodrome.move();
        for (Horse horse : hippodrome.getHorses()) {
            verify(horse).move();
        }
    }

    @Test
    void testGetWinner() {
        Hippodrome hippodrome = new Hippodrome(horses);
        Horse expectedHorse = hippodrome.getWinner();
        Horse actualHorse = horses.get(0);
        Assertions.assertEquals(expectedHorse, actualHorse);
    }
}