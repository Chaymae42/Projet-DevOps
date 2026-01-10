package test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageServiceTest {

    @Test
    void testGetMessage() {
        MessageService service = new MessageService();
        String message = service.getMessage();

        assertEquals(
            "Bonjour et bon courage dans votre projet DevOps – Branche DEV",
            message
        );
    }
}