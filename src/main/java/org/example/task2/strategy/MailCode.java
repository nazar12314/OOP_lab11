package org.example.task2.strategy;

public interface MailCode {
    String generate(Client client);

    String getHeader();
}
