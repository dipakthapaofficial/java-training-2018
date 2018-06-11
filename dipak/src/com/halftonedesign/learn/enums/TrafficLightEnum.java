package com.halftonedesign.learn.enums;

public enum TrafficLightEnum {
	RED("Stop", 10l), GREEN("Go", 10l),  YELLOW("Slow Down", 5l);
	
	private String action;
	private Long delay;
	
	private TrafficLightEnum(String action, Long delay) {
		this.action = action;
		this.delay = delay;
	}


	public String getAction() {
		return action;
	}


	public Long getDelay() {
		return delay;
	}

}
