package com.java.exceptionHandling;

public class Person {

   private int age;

  private  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException{

            if (age < 0) {
                throw new IllegalArgumentException("age cannot be negative");
            }
            this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
