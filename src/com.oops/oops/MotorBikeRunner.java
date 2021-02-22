package com.oops.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MotorBike ducati = new MotorBike(25);
        MotorBike honda = new MotorBike(15);
        MotorBike bmw = new MotorBike();

        ducati.start();
        honda.start();
        bmw.start();


        //ducati.setSpeed(70);
        ducati.increaseSpeed(50);
        ducati.decreaseSpeed(20);
        System.out.println(ducati.getSpeed());

        //honda.setSpeed(40);
        honda.increaseSpeed(35);
        honda.decreaseSpeed(15);
        System.out.println(honda.getSpeed());

        bmw.setSpeed(70);
        bmw.increaseSpeed(50);
        bmw.decreaseSpeed(20);
        System.out.println(bmw.getSpeed());

    }

}
