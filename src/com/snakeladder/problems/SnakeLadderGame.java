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
	
	
	
	public static void main(String[] Args) {
        int start = 0;
        System.out.println("Start Position:" +start);
        rollDice();
        checkOption();
        winningPosition();
    }
}
