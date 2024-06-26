package com.java.exceptionInheritance;

import java.io.IOException;

public class Subclass extends Superclass{

    public void superClassMethod() throws ArithmeticException{
        System.out.println("Inside the super class method");
    }

    public void subClassMethod() throws IOException {
        System.out.println("Inside the sub class method");
    }

}
