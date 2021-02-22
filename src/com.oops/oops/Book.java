package com.oops.oops;

public class Book {
    private int noOfCopies;

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    void read() {
        System.out.println("reading");
    }

}
