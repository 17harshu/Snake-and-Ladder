package com.snakeladder.problems;

import java.util.Random;

public class SnakeLadderGame {
	static final int noPlay=0;
	static final int ladder=1;
	static final int snake=2;
	
	public static void rollDice() {
		int dice=(int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Dice rolled value: " + dice);
	}
	
	public static void checkOption() {
		  //Random ran = new Random();
		  //int dice = ran.nextInt(6)+1;
		  //int position = 0;
		  //int ran=(int) (Math.floor(Math.random() * 10) % 6) + 1;
		 int position = 0;
		  Random ran = new Random();
		  int dice = ran.nextInt(6)+1;
		  System.out.println("dice: "+dice);
		int optionCheck = ran.nextInt(3);
		  System.out.println("optionCheck: "+optionCheck);
		  
		  if (optionCheck == ladder) 
		  {
		   System.out.println("Ladder");
		   position = position + dice;
		  }
		  
		  else if (optionCheck == snake) 
		  {
		   System.out.println("Snake");
		   position = position - dice;
		  }
		  else {
		   System.out.println("No Play");
		  }
		  if (position<0)
		   {
			  position=0;
		   }
		   System.out.println("position: "+position);
	}
	
	public static void winningPosition() {
		int position = 0;
		while (position<100) 
		{
			Random ran = new Random();
			int dice = ran.nextInt(6)+1;
			System.out.println("dice: "+dice);
			int optionCheck = ran.nextInt(3);
			System.out.println("optionCheck: "+optionCheck);
			
			
			if ((optionCheck == ladder) && (position+dice)<=100) 
			{
				System.out.println("ladder");
				position = position + dice;
			}
			else if (optionCheck == snake) 
			{
				System.out.println("Snake");
				position = position - dice;
			}
			else {
				System.out.println("Noplay");				
			}
			if (position<0) 
			{
				position =0;
			}
			System.out.println("position: "+position);
			
		}
	}
	
	public static void checkWinningPosition() {
		int position = 0;
		while (position<100) 
		{
			Random ran = new Random();
			int dice = ran.nextInt(6)+1;
			System.out.println("dice: "+dice);
			int optionCheck = ran.nextInt(3);
			System.out.println("optionCheck: "+optionCheck);
			
			
			if ((optionCheck == ladder) && (position+dice)<=100) 
			{
				System.out.println("ladder");
				position = position + dice;
			}
			else if (optionCheck == snake) 
			{
				System.out.println("Snake");
				position = position - dice;
			}
			else {
				System.out.println("Noplay");				
			}
			if (position<0) 
			{
				position =0;
			}
			System.out.println("position: "+position);
			
		}
	}
	
	public static void winGAme() {
		int position = 0;
		while (position<100) 
		{
			Random ran = new Random();
			int dice = ran.nextInt(6)+1;
			System.out.println("dice: "+dice);
			++dice;
			int optionCheck = ran.nextInt(3);
			System.out.println("optionCheck: "+optionCheck);
			
			
			if ((optionCheck == ladder) && (position+dice)<=100) 
			{
				System.out.println("ladder");
				position = position + dice;
			}
			else if (optionCheck == snake) 
			{
				System.out.println("Snake");
				position = position - dice;
			}
			else {
				System.out.println("Noplay");				
			}
			if (position<0) 
			{
				position =0;
			}
			System.out.println("position: "+position+"\ndicecount: "+dice);
			
		}
	}
	
	public static void twoPlayer() {
		final int snake = 2;
		final int ladder = 1;
		final int Noplay= 0;
		int diceCount = 0;
		final int PLAYER1 = 1;
		final int PLAYER2 = 2;
		int playerOnePosition = 0;
		int playerTwoPosition = 0;
		int player = PLAYER1;
		System.out.println("playerOnePosition: "+playerOnePosition);
		System.out.println("playerTwoPosition: "+playerTwoPosition);
		Random ran = new Random();
		
		while ((playerOnePosition<100) && (playerTwoPosition<100)) 
		{
			
			int dice = ran.nextInt(6)+1;
			System.out.println("dice: "+dice);
			++diceCount;
			int optionCheck = ran.nextInt(3);
			System.out.println("optionCheck: "+optionCheck);
			
			if(player == PLAYER1) 
			{
			
				playerOnePosition=positionCheck(dice,playerOnePosition,optionCheck);
				if ((optionCheck == snake) || (optionCheck == Noplay)) 
				{
					player = PLAYER2;
				}									
			}
			else if (player == PLAYER2) {
				playerTwoPosition=positionCheck(dice,playerTwoPosition,optionCheck);
				if ((optionCheck == snake) || (optionCheck == Noplay)) 
				{
					player = PLAYER1;
				}
			}
						
		}
		System.out.println();
		System.out.println("Player One Position: "+playerOnePosition);
		System.out.println("Player Two Position"+playerTwoPosition);
		System.out.println("diceCount: "+diceCount);
		if(playerOnePosition == 100) 
		{
			System.out.println("Player One Wins");
		}
		else 
		{
			System.out.println("Player Two Wins");
		}
	
	}
	
	
	private static int positionCheck(int dice, int playerTwoPosition, int optionCheck) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] Args) {
        int start = 0;
        System.out.println("Start Position:" +start);
        rollDice();
        checkOption();
        winningPosition();
        checkWinningPosition();
        twoPlayer();
    }
}
