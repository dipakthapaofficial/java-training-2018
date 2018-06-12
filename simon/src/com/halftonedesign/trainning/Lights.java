package com.halftonedesign.trainning;

public enum Lights {
	RED(Test.STOP), YELLOW(Test.SLOW_DOWN), GREEN(Test.GO);

	private Test test;

	private Lights(Test test) {
		this.test = test;
	}

	public Test getTest() {
		return test;
	}
};
