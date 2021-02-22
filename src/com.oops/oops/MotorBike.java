package com.oops.oops;

public class MotorBike {
	private int speed;

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		if (speed >= howMuch)
			this.speed = this.speed - howMuch;
	}

	void start() {
		System.out.println("Started");
	}

}
