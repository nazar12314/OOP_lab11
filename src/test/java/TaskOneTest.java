import org.example.task1.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskOneTest {

    @Test
    public void testUserBuilder() {
        User user = User
                .builder()
                .firstName("Nazar")
                .lastName("Kononenko")
                .weight(100)
                .height(200)
                .email("nazar.kononenko@ucu.edu.ua")
                .build();

        Assertions.assertEquals(user.getName(), "Nazar");
        Assertions.assertEquals(user.getWeight(), 100);
    }
}
