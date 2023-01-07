package org.example.task1;

import lombok.Builder;
import lombok.Generated;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
public class User {
    @Generated
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate date;
    private double height;
    private double weight;

    public String getName() {
        return firstName + " " + lastName;
    }
}
