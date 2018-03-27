package com.tests.labpvttest;

import java.util.ArrayList;

public class Dancer {

	ArrayList<Integer> sequence = new ArrayList<Integer>();

	public Dancer(ArrayList<Integer> sequence) {
		this.sequence = sequence;
	}

	private boolean isCanDance() {
		if (sequence.get(0) != 0 && sequence.get(0) % 2 == 0 && sequence.get(0) < sequence.size()) {
			return true;
		}
		return false;
	}

	public boolean dance() {
		if (isCanDance()) {
			// TODO dance
		}
		return false;

	}
}
