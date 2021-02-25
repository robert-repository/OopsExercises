package com.oops.oops;

public class NumberRunner {
    public static void main(String[] args) {
        Number biNumber = new Number(2, 3);
        System.out.println(biNumber.addNumbers());
        System.out.println(biNumber.multiply());
        biNumber.doubleNumber();
        System.out.println(biNumber.getNum1());
        System.out.println(biNumber.getNum2());

    }
}
