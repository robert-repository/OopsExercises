package com.oops.oops;

public class MotorBike {
	private int speed;

	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Started");
	}

}
