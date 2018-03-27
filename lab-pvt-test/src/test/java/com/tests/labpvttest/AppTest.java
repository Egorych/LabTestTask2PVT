package com.tests.labpvttest;

import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	@Test
	public void testApp() {

		assertEquals(4, new TournamentOrganizer("2 0 7").startTournament());
		assertEquals(0, new TournamentOrganizer("8").startTournament());
		assertEquals(4, new TournamentOrganizer("2 2 1").startTournament());
		assertEquals(12, new TournamentOrganizer("4 2 0 2 3").startTournament());
		assertEquals(12, new TournamentOrganizer("4 2 9 2 3").startTournament());
		assertEquals(12, new TournamentOrganizer("6 2 2 4 9 1 3").startTournament());
		assertEquals(24, new TournamentOrganizer("6 9 5 9 9 6 1 7 7 5 5 9").startTournament());
		assertEquals(-1, new TournamentOrganizer("2 1 1").startTournament());
		assertEquals(12, new TournamentOrganizer("2 3 4 5 6 7 8 9").startTournament());
		assertEquals(24, new TournamentOrganizer("2 4 6 8 8 6 4 2 1 2 5 2").startTournament());
		assertEquals(-1, new TournamentOrganizer("4 2 9 2 1 2 2 2 1 1").startTournament());

	}
}
