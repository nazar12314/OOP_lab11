package org.example.task2.strategy;

public class GiftMail implements MailCode {
    private GiftMail() {}

    private static GiftMail giftMail;
    private static final String HEADER = "Special gift proposition!";
    private static final String TEMPLATE =
            "Hello %NAME, I am very exited to offer you a special proposition,"
            +
            " only from 5th to 10th of April, "
            +
            "you will be able to buy each of our products with the discount of 50%!";

    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }

    public String getHeader() {
        return HEADER;
    }

    public static GiftMail getInstance() {
        if (giftMail == null) {
            giftMail = new GiftMail();
        }

        return giftMail;
    }

}
