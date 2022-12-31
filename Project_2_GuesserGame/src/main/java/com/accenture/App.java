package com.accenture;

import java.util.Scanner;

import java.util.Random;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		Umpire umpire = context.getBean(Umpire.class);
		Scanner s = context.getBean(Scanner.class);
		Random random = context.getBean(Random.class);

		System.out.println("------------------------------------------------------------------------");

		// Guesser Input
		Guesser guesser = context.getBean("guesser", Guesser.class);
		guesser.guessNum(random);

		// Player Input
		Player player1 = context.getBean("player", Player.class);
		player1.playerGuessNum(s);

		Player player2 = context.getBean("player", Player.class);
		player2.playerGuessNum(s);

		Player player3 = context.getBean("player", Player.class);
		player3.playerGuessNum(s);

		// Collect & Compare
		Umpire umpireG = context.getBean("umpire", Umpire.class);
		umpireG.collectNumFrGuesser(guesser);

		Umpire umpireP = context.getBean("umpire", Umpire.class);
		umpireP.collectNumFrPlayers(player1, player2, player3);

		Umpire umpire1 = context.getBean("umpire", Umpire.class);
		umpire1.compareBetween();

		System.out.println("------------------------------------------------------------------------");

	}

}