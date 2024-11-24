package com.lab11.task2;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;


public class MailSender {
    public void sendMail(MailInfo mailInfo){
        Properties props = new Properties();
        props.put("mail.smtp.host", smtpHost); //enter your smtp Host id
        props.put("mail.smtp.port", smtpPort); //enter your smtp Host id
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Create a session with the required authentication
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password); //Enter your usename and password
            }
        });

        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username)); //Enter your usename
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ivasiuk.pn@ucu.edu.ua"));
            message.setSubject("hello");
            message.setText("hello");

            // Send the email
            Transport.send(message);
            System.out.println("Email sent successfully.");

        } catch (MessagingException e) {
            e.printStackTrace();
            System.err.println("Error sending email: " + e.getMessage());
        }
    }
}
