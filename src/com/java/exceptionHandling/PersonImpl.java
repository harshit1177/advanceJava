package com.java.exceptionHandling;

public class PersonImpl {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setAge(-1);
        person1.setName("Dummy");
        System.out.println(person1.getAge() + " "+ person1.getName());
    }
}
