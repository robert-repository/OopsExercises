package com.oops.oops;

public class Book {
    private int noOfCopies;

    Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        if (noOfCopies > 0)
            this.noOfCopies = noOfCopies;
    }

    public void increaseNumberOfCopies(int howMany) {
        setNoOfCopies(this.noOfCopies + howMany);
    }

    public void decreaseNumberOfCopies(int howMany) {
        setNoOfCopies(this.noOfCopies - howMany);
    }

    void read() {
        System.out.println("reading");
    }

}
