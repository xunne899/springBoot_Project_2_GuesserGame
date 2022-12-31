package com.accenture;
import java.util.Scanner;
import java.util.Random;


public class Umpire {

	int numFrP1;
	int numFrP2;
	int numFrP3;
	int numFrGuesser;
	private Random random;
	private Scanner scan;
	
	public void collectNumFrGuesser(Guesser g){

		numFrGuesser = g.getGnum();
		
	}


	public void collectNumFrPlayers(Player p1, Player p2, Player p3) {
		
		numFrP1 = p1.getPnum();
		numFrP2 = p2.getPnum();
		numFrP3 = p3.getPnum();
		
	}
	
	public void compareBetween() {
		System.out.println("Number guess by Guesser is " + numFrGuesser);
		if(numFrGuesser == numFrP1 && numFrGuesser == numFrP2 && numFrGuesser == numFrP3) 
		{
			System.out.println(" P1 ,P2, P3 are the winners");
		}
		else if(numFrGuesser == numFrP1 && numFrGuesser == numFrP2) {
		System.out.println("P1 and P2 has won the game");
	}
		else if(numFrGuesser == numFrP1 && numFrGuesser == numFrP3){
			System.out.println("P1 and P3 has won the game");	
		}
		else if(numFrGuesser == numFrP2 && numFrGuesser == numFrP3){
			System.out.println("P2 and P3 has won the game");	
		}
		else if (numFrGuesser == numFrP1 ) {
			System.out.println("P1 has won the game");
		}
		else if (numFrGuesser == numFrP2 ) {
			System.out.println("P2 has won the game");
		}
		else if (numFrGuesser == numFrP3 ) {
			System.out.println("P3 has won the game");
		}
		else {
			System.out.println("You have lose. Please try again");
		}
		
		}
}

	

	
