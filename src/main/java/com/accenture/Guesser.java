package com.accenture;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
	int gnum;
	private Random random;

	public int getGnum() {
		return gnum;
	}

	public int guessNum(Random random) {
		this.random = random;
		gnum = random.nextInt(1, 10);
		return gnum;
	}

}
