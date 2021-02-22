package com.oops.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.speed = 80;
		ducati.speed = 60;

		honda.speed = 40;
		honda.speed = 20;

	}

}
