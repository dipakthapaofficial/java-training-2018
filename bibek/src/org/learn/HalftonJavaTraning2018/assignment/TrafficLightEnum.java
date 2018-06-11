package org.learn.HalftonJavaTraning2018.assignment;

public enum TrafficLightEnum {

	RED("Stop", 10), GREEN("Go", 10), YELLOW("Slow", 5);

	private final String command;
	private final int time;

	TrafficLightEnum(String commands, int time) {
		this.command = commands;
		this.time = time;
	}

	public String getCommand() {
		return command;
	}

	public int getTime() {
		return time;
	}
}
