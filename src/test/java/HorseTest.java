import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class HorseTest {

    @Test
    void testHorseConstructorFirstParameterForIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Horse(null, 10).getName());
    }

    @Test
    void testHorseConstructorFirstParameterForNullIllegalArgumentExceptionMessage() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Horse(null, 10).getName());
        String expectedMessage = "Name cannot be null.";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "   "})
    void testHorseConstructorFirstParameterForBlankIllegalArgumentException(String name) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Horse(name, 10));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "   "})
    void testHorseConstructorFirstParameterForBlankIllegalArgumentExceptionMessage(String name) {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Horse(name, 10));
        String expectedMessage = "Name cannot be blank.";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testHorseConstructorSecondParameterForIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Horse("test", -1));
    }

    @Test
    void testHorseConstructorSecondParameterForIllegalArgumentExceptionMessage() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Horse("test", -1));
        String expectedMessage = "Speed cannot be negative.";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testHorseConstructorThirdParameterForIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Horse("test", 10, -1));
    }

    @Test
    void testHorseConstructorThirdParameterForIllegalArgumentExceptionMessage() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Horse("test", 10, -1));
        String expectedMessage = "Distance cannot be negative.";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void getName() {

    }

    @Test
    void getSpeed() {
    }

    @Test
    void getDistance() {
    }

    @Test
    void move() {
    }
}