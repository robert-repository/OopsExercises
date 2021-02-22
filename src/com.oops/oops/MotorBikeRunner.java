package com.oops.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(80);
        System.out.println(ducati.getSpeed());

        honda.setSpeed(40);
        System.out.println(honda.getSpeed());

    }

}
