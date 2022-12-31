package com.accenture;

import java.util.Scanner;

public class Player {
	int pnum;

	private Scanner scan;

	public int getPnum() {
		return pnum;
	}

	public int playerGuessNum(Scanner scan) {
		System.out.println("Player ! Please guess a number between 1 to 9. Key in a value below");
		this.scan = scan;
		pnum = scan.nextInt();
		return pnum;

	}

}
