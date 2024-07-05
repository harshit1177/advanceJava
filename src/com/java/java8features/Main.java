package com.java.java8features;

import com.mysql.cj.result.SqlDateValueFactory;

public class Main {

    public static void main(String[] args) {


        Area circle2 =  (int a) -> {
                                   return 3.14f * a * a;
                                  };

        float areaCircle =  circle2.returnArea(10);
        System.out.println(areaCircle);


        Area square =    (int a) -> {
            return a * a;
        };
       float areaSquare =  square.returnArea(12);
        System.out.println(areaSquare);

    }
}
