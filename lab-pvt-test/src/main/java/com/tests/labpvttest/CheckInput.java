package com.tests.labpvttest;

public class CheckInput {

	private String[] sequenceOfNumbersSplit;

	public CheckInput(String[] sequenceOfNumbersSplit) {
		this.sequenceOfNumbersSplit = sequenceOfNumbersSplit;
	}

	private boolean isLengthCorrect() {
		if (sequenceOfNumbersSplit.length > 0 && sequenceOfNumbersSplit.length < 51) {
			return true;
		}
		return false;

	}

	public boolean check() {
		if (isLengthCorrect()) {
			// to do checking sequence
			return true;
		}

		return false;

	}
}
