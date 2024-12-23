package com.lab.task2;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString @Getter @NoArgsConstructor
public class Client {
    private static int idCounter;
    private int id = idCounter++;
    private String name;
    private LocalDate dob;
    private String sex;
    private String email;
    public Client(String name, LocalDate dob, String sex, String email) {
        this.name = name;
        this.dob = dob;
        this.sex = sex;
        this.email = email;
    }   
}
