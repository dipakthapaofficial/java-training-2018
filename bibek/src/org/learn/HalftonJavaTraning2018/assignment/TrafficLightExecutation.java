package org.learn.HalftonJavaTraning2018.assignment;

public class TrafficLightExecutation {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			TrafficLightEnum signal = TrafficLightEnum.GREEN;
			System.out.println(signal.getCommand());
			System.out.println(signal.getTime());
			Thread.sleep(10000);
			signal = TrafficLightEnum.YELLOW;
			System.out.println(signal.getCommand());
			System.out.println(signal.getTime());
			Thread.sleep(50000);
			signal = TrafficLightEnum.RED;
			System.out.println(signal.getCommand());
			System.out.println(signal.getTime());
			Thread.sleep(10000);
		}

	}

}
