package com.lab11.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generate() {
        //based on client info and mailCode
        return mailCode.generate(client);
    }
}
