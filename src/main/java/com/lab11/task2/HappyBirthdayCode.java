package com.lab11.task2;

public class HappyBirthdayCode implements MailCode{
    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy Birthday", client.getName());
    }
    
}