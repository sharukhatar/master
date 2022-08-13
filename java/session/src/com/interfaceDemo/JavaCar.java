package com.interfaceDemo;

public class JavaCar extends Acceleratable implements Brakeable, Audible
{

	public static void main(String[] args) {
		JavaCar car = new JavaCar();
		car.accelatable();
		car.brake();
		car.playMusic();
	}

	@Override
	public void brake() {
		System.out.println("Stopping the car!");
	}

	@Override
	public void playMusic() {
		System.out.println("I found the love");
	}
}
