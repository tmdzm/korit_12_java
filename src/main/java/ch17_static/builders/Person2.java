package ch17_static.builders;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder

public class Person2 {
    //Person
    private String name;
    private int age;
    private String address;
}
