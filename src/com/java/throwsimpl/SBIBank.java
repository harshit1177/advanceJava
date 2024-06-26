package com.java.throwsimpl;

import java.util.Random;

public class SBIBank implements  Bank{


    @Override
    public String giveAccounNo(int length) throws IllegalArgumentException {
       if(length<=0)
           throw  new IllegalArgumentException("Make sure length >0");
       else {
           String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<length;i++) {
                int index = random.nextInt(characters.length());
                sb.append(characters.charAt(index));
            }
            return sb.toString();
       }
    }

    @Override
    public String accountHolderName(int length) throws IllegalArgumentException {
        return "";
    }
}
