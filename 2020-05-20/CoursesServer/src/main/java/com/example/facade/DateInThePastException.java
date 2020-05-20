package com.example.facade;

public class DateInThePastException extends Exception {

	public DateInThePastException() {
		super("Start date cannot be in the past!");
	}
}
