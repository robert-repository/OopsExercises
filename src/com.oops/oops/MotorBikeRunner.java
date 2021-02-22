package com.oops.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(80);
        ducati.setSpeed(60);

        honda.setSpeed(40);
        honda.setSpeed(20);

    }

}
