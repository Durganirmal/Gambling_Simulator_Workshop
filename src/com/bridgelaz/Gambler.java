package com.bridgelaz;

public class Gambler {

	public static void main(String[] args) {
		int stake = 100;
		int bet = 1;
		int die = (int)((Math.random()*3)%2);
		if(die == 1) {
			System.out.println("Wins");
		}
		else {
			System.out.println("Loose");
		}
	}
}