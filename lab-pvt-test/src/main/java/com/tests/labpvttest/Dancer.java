package com.tests.labpvttest;

import java.util.ArrayList;

public class Dancer {

	private Movements movements;
	private ArrayList<Integer> sequence = new ArrayList<Integer>();
	private int currentPosition = 0;
	private int newPosition = 0;

	public Dancer(ArrayList<Integer> sequence) {
		movements = new Movements(sequence);
		this.sequence = sequence;
	}

	private boolean isCanDance() {
		if (sequence.get(0) != 0 && sequence.get(0) % 2 == 0 && sequence.get(0) < sequence.size()) {
			return true;
		}
		return false;
	}

	public int dance() {
		if (isCanDance()) {
			while (newPosition != -1) {
				currentPosition = newPosition;
				newPosition = movements.move(sequence.get(currentPosition));
			}
			return movements.getCountOfSteps() + currentPosition;
		}

		return 0;

	}
}
