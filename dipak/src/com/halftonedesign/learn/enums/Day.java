package com.halftonedesign.learn.enums;

public enum Day {
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	private int number;

	private Day(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}
	
	

}
