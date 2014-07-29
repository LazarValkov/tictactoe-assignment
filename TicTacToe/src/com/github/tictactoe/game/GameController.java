package com.github.tictactoe.game;

import java.util.Scanner;

public class GameController {
	private Scanner in;
	private Board board;
	
	
	public GameController()
	{
		in = new Scanner(System.in);
		board = new Board();
	}
	
	public void startGame()
	{
		while(!board.isFull() && !board.getVictory())
		{
			System.out.println(board);
			getMove();
		}
		
	}
	
	private void getMove()
	{
		int tempRow;
		int tempCol;

		System.out.println("Player " + board.getCurrentPlayer() + " 's turn.");
		do
		{
			System.out.println("Please enter valid rol:");
			tempRow = in.nextInt();
			System.out.println("Please enter valid col:");
			tempCol = in.nextInt();
		}
		while(!board.makeMove(tempRow, tempCol));
	}
}
