package org.learn.HalftonJavaTraning2018.assignment;

public class TrafficLightExecutation {

	public static void main(String[] args) throws InterruptedException {
		while(true) {
			TrafficLight signal = TrafficLight.GREEN;
			System.out.println(signal.getCommands()); 
			System.out.println(signal.getTime());
			Thread.sleep(10000);
			signal = TrafficLight.YELLOW;
			System.out.println(signal.getCommands()); 
			System.out.println(signal.getTime());
			Thread.sleep(50000);
			signal = TrafficLight.RED;
			System.out.println(signal.getCommands()); 
			System.out.println(signal.getTime());
			Thread.sleep(10000);
		}
		
		
	}

}
