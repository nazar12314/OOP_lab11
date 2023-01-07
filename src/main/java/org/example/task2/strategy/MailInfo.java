package org.example.task2.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MailInfo {
    @Getter
    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }

    public String getHeader() {return mailCode.getHeader(); }
}
