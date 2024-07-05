package com.java.java8features;

import java.util.function.LongPredicate;
import java.util.function.Supplier;

public class Main2 {

    public static  void main(String[] args) {

        //logic first
        MyFunctionalInterface squareValue = (a) -> {
            System.out.println("the square is " + a*a);
        };

        MyFunctionalInterface cubeValue = (a) -> {
            System.out.println("the cube is "+ a*a*a);
        };

        squareValue.returnOperation(10);
        cubeValue.returnOperation(10);

        Supplier supplies = () -> { return "Hello"; };

        System.out.println(supplies.get());


        LongPredicate giveResult = (value) -> {
            if(value >10 )
                return true;
            else return false; };

        System.out.println(giveResult.test(9l));
    }
}
