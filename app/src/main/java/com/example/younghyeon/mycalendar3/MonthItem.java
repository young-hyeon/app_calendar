package com.example.younghyeon.mycalendar3;

public class MonthItem {

	private int dayValue;

	public MonthItem() {

	}

	public MonthItem(int day) {
		dayValue = day;
	}

	public int getDay() {
		return dayValue;
	}

	public void setDay(int day) {
		this.dayValue = day;
	}

}