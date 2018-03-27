package com.tests.labpvttest;

import java.util.ArrayList;

public class TournamentOrganizer {

	private DataInput dataInput;
	private ArrayList<Integer> sequence = new ArrayList<Integer>();
	private Dancer dancer;

	public TournamentOrganizer(String sequence) {
		dataInput = new DataInput(sequence);
	}

	public void startTournament() {
		if (dataInput.validateInput()) {
			sequence = dataInput.getIntSequance();
			dancer = new Dancer(sequence);
			System.out.println(dancer.dance());

		} else
			System.out.println("Incorrect sequence");

	}
}
