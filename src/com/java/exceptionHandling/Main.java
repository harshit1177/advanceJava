package com.java.exceptionHandling;

import java.util.Arrays;
import java.util.Scanner;


//you cannot write only the try block,
// you have to write try block with either catch/finally or both
// order will be --> try -> catch -> finally
// you can write nested try catch block in all the three blocks.
public class Main {

    public static void main(String[] args) {

        int[] noArray = new int[3];

         try {
             for (int i = 0; i < noArray.length; i++) {
                 noArray[10] = i;
             }
         }
            catch(Exception ex){
                System.out.println("Please check your logic ");
            }

         finally {
             try {
                 System.out.println(noArray[100]);
             }
             catch(Exception e){
                 System.out.println(e);
             }
         }

         try{
             String str = null;
             int length = str.length(); //
         }
         catch(Exception ex){
             System.out.println(ex);
         }


    }


}


