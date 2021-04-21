import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTests {
    private final Greetings greetings = new Greetings();

    @Test
    void testGreetings() {
        boolean result = greetings.containsGreeting("Hello Earthlings!");

        assertEquals(true, result);
    }
}
