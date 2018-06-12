package com.halftonedesign.trainning;

public class Trafficlight {
	public static void main(String[] args) throws InterruptedException{
	
		do {
			System.out.println("Current Light: "+Lights.RED);
			System.out.println("Command: "+Lights.RED.getTest());
			Thread.sleep(10000);
			System.out.println("Current Light: "+Lights.YELLOW);
			System.out.println("Command: "+Lights.YELLOW.getTest());
			Thread.sleep(5000);
			System.out.println("Current Light: "+Lights.GREEN);
			System.out.println("Command: "+Lights.GREEN.getTest());
			Thread.sleep(10000);
		}while(1<2);
	}
}
