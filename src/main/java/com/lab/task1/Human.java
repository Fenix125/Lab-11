package com.lab.task1;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder @Getter @ToString
public class Human {
    private String firstName;
    private String lastName;
}
