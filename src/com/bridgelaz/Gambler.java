package com.bridgelaz;

import java.util.Random;

public class Gambler {

	public static void main (String[] args){
        int stake_of_Gambler= 100;
        int bet_for_Game = 1;
        Random ran = new Random();
        int i = ran.nextInt(2);
        if (i==0){
            System.out.println("Player won the game");
            stake_of_Gambler=stake_of_Gambler+bet_for_Game;
        }
        else{
            System.out.println("Player loss the Game");
            stake_of_Gambler=stake_of_Gambler-bet_for_Game;
        }

    }
}
