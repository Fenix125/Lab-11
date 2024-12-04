package com.lab.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generate() {
        //based on client info and mailCode
        return mailCode.generate(client);
    }
    public String getClientEmail() {
        return client.getEmail();
    }
}
