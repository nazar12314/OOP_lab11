package org.example.task2.strategy;

public class BirthdayGreetingMail implements MailCode {
    private static BirthdayGreetingMail birthdayGreetingMail;

    private BirthdayGreetingMail() {}

    private static final String HEADER = "Happy birthday!";

    private static final String TEMPLATE =
            "Hello %NAME, I want to congratulate you"
                    +
            " with your %AGE-th birthday, and wish you all the blessing you may need!";

    @Override
    public String generate(Client client) {
         return TEMPLATE
                 .replaceAll("%NAME", client.getName())
                 .replaceAll("%AGE", String.valueOf(client.getAge() + 1));
    }

    public String getHeader() {
        return HEADER;
    }

    public static BirthdayGreetingMail getInstance() {
        if (birthdayGreetingMail == null) {
            birthdayGreetingMail = new BirthdayGreetingMail();
        }

        return birthdayGreetingMail;
    }
}
