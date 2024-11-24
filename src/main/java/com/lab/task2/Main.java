package com.lab.task2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client);
        Client client2 = new Client();
        System.out.println(client2);

        Client client3 = new Client("Mykhailo", LocalDate.of(2005, 11, 19), "male");
        MailInfo mailInfo = new MailInfo(client3, new HappyBirthdayCode());
        System.out.println(mailInfo.generate());

        MyImage img = new ProxyImage("/Users/admin/Desktop/JavaProjects/study_semestr1/lab11/Unknown.jpeg");
        img.display();
    }
}