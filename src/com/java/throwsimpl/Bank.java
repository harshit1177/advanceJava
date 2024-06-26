package com.java.throwsimpl;

public interface Bank {

    String giveAccounNo(int length) throws IllegalArgumentException;

    String accountHolderName(int length) throws IllegalArgumentException;
}
