package org.learn.HalftonJavaTraning2018.assignment;

public enum TrafficLightEnum {

	RED(NextEnum.STOP,10), GREEN(NextEnum.GO, 10), YELLOW(NextEnum.SLOW, 5);

	private final NextEnum command;
	private final int time;

	TrafficLightEnum(NextEnum commands, int time) {
		this.command = commands;
		this.time = time;
	}

	
	
	public NextEnum getCommand() {
		return command;
	}

	public int getTime() {
		return time;
	}
}
