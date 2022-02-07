package com.snakeladder.problems;

public class SnakeLadderGame {
	
	public static void rollDice() {
		int dice=(int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Dice rolled value: " + dice);
	}
	
	public static void main(String[] Args) {
        int start = 0;
        System.out.println("Start Position:" +start);
        rollDice();
    }
}
