package com.halftonedesign.trainning;

public enum Lights {
	RED("Stop"), YELLOW("Slow Down"), GREEN("Go");
	
	private String action;	
	
	private Lights(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}

}
