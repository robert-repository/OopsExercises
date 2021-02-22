package com.oops.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book artOfComputerProgramming = new Book(10);
		Book effectiveJava = new Book(20);
		Book cleanCode = new Book(30);

		artOfComputerProgramming.read();
		effectiveJava.read();
		cleanCode.read();

		//artOfComputerProgramming.setNoOfCopies(1400);
		artOfComputerProgramming.increaseNumberOfCopies(150);
		artOfComputerProgramming.decreaseNumberOfCopies(50);
		System.out.println(artOfComputerProgramming.getNoOfCopies());

		//effectiveJava.setNoOfCopies(1500);
		effectiveJava.increaseNumberOfCopies(200);
		effectiveJava.decreaseNumberOfCopies(2000);
		System.out.println(effectiveJava.getNoOfCopies());

		//cleanCode.setNoOfCopies(800);
		effectiveJava.increaseNumberOfCopies(57);
		effectiveJava.decreaseNumberOfCopies(7);
		System.out.println(cleanCode.getNoOfCopies());

	}

}
