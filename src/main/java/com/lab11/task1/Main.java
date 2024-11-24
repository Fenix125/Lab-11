package com.lab11.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                            .age(19)
                            .FirstName("Mykhailo")
                            .LastName("Ivasiuk")
                            .group("CS-1")
                            .height(187)
                            .grades(List.of(5, 4, 3))
                            .grade(1)
                            .build();
                           
        System.out.println(student);
        
    }
}
