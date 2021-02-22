package com.oops.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.read();
		effectiveJava.read();
		cleanCode.read();

		artOfComputerProgramming.setNoOfCopies(1400);
		effectiveJava.setNoOfCopies(1500);
		cleanCode.setNoOfCopies(800);

	}

}
