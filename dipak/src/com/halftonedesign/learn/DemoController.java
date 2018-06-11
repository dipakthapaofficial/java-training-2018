package com.halftonedesign.learn;

import java.util.concurrent.TimeUnit;

import com.halftonedesign.learn.enums.Day;
import com.halftonedesign.learn.enums.TrafficLightEnum;

public class DemoController {

	public static void main(String[] args) throws InterruptedException {

		Day day = Day.SUNDAY;

		String s = "abc";
		String abc = new String("abc");
		System.out.println(s == abc);
		System.out.println(s.equals(abc));

		switch (day) {
		case SUNDAY:
			System.out.println("Lazy day\n");
			System.out.println("number=" + day.getNumber());
			break;
		case FRIDAY:
			System.out.println("Fun Day \n");
			break;
		case SATURDAY:
			System.out.println("Gloat Day \n");
			break;

		default:
			System.out.println("Normal day \n");
			break;
		}

		for (Day day1 : Day.values()) {
			System.out.println(day1);
		}

		System.out.println(Day.valueOf("SUNDAY"));

		for (;;) {
			for (TrafficLightEnum light : TrafficLightEnum.values()) {
				System.out.println("\n Light:" + light);
				System.out.println("\n Action:" + light.getAction());
				// Thread.sleep(light.getDelay() * 1000);
				// TimeUnit.SECONDS.sleep(light.getDelay());

				switch (light) {
				case GREEN:
					TimeUnit.SECONDS.sleep(10);
					break;
				case RED:
					TimeUnit.SECONDS.sleep(10);
					break;
				case YELLOW:
					TimeUnit.SECONDS.sleep(5);
					break;
				}
			}
			System.out.println("\n\n Rotation \n\n");
		}

	}

}
