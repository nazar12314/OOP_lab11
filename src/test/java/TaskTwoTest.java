import org.example.task2.strategy.BirthdayGreetingMail;
import org.example.task2.strategy.Client;
import org.example.task2.strategy.Gender;
import org.example.task2.strategy.GiftMail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTwoTest {

    @Test
    public void testGreetingMales() {
        Client client = Client
                .builder()
                .name("Nazar")
                .age(18)
                .sex(Gender.MALE)
                .build();

        BirthdayGreetingMail birthdayGreeting = BirthdayGreetingMail.getInstance();
        GiftMail giftMail = GiftMail.getInstance();

        Assertions.assertEquals(
                birthdayGreeting.generate(client),
                "Hello Nazar, I want to congratulate you"
                        +
                        " with your 19-th birthday, and wish you all the blessing you may need!"
        );

        Assertions.assertEquals(
                giftMail.generate(client),
                "Hello Nazar, I am very exited to offer you a special proposition,"
                        +
                        " only from 5th to 10th of April, "
                        +
                        "you will be able to buy each of our products with the discount of 50%!"
        );
    }

}
