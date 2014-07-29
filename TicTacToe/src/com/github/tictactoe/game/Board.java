package com.github.tictactoe.game;

public class Board {
	private static final int BOARD_DIMENTION=3;
	private static final int PLAYER_COUNT=2;
	
	private final char[] playerSymbols;
	//define who's turn it is (0 for player 1, and 1 for player 2)
	private int turn;
	
	public char[][] board;
	
	private boolean victory;
	private boolean isFull;
	
	public Board()
	{
		this('X', 'O');
	}
	public Board(char aPlayer1Symbol, char aPlayer2Symbol)
	{
		playerSymbols = new char[PLAYER_COUNT];
		playerSymbols[0] = aPlayer1Symbol;
		playerSymbols[1] = aPlayer2Symbol;
		
		// Initialise the board
		board = new char[BOARD_DIMENTION][BOARD_DIMENTION];
		victory = false;
		isFull = false;
		turn = 0;
		for(int row=0; row<BOARD_DIMENTION; row++)
		{
			for(int col=0; col<BOARD_DIMENTION; col++)
			{
				board[row][col] = '-';
			}
		}
	}
	
	// Returns true if the move has been made and false otherwise
	public boolean makeMove(int row, int col)
	{
		// TODO: Check for invalid moves (already occupied position / invalid index / game ended)
		board[row][col] = playerSymbols[turn];
		// turn must only alter between 0 and 1
		turn = (turn+1)%PLAYER_COUNT;
		
		checkWin(row, col);
		checkIfFull();
		
		return true;
		
	}
	
	private void checkWin(int row, int col)
	{
		if(checkWin_d1() || checkWin_d2() || checkWin_Row(row) || checkWin_Col(col))
		{
			victory = true;
			return;
		}
	}
	
	private boolean checkWin_d1()
	{
		//TODO: implement the check;
		return false;
	}
	
	private boolean checkWin_d2()
	{
		//TODO: implement the check;
		return false;
	}
	
	private boolean checkWin_Row(int row)
	{
		//TODO: implement the check
		return false;
	}
	
	private boolean checkWin_Col(int col)
	{
		//TODO: implement the check
		return false;
	}
	
	//checks if the board is bull
	private void checkIfFull()
	{
		// TODO: check if it's full
		return;
	}
	
	char getCurrentPlayer()
	{
		return playerSymbols[turn];
	}
	
	boolean getVictory()
	{
		return victory;
	}
	
	boolean isFull()
	{
		return isFull;
	}
	
	@Override
	public String toString()
	{
		String output = "";
		for(int row=0; row<BOARD_DIMENTION; row++)
		{
			for(int col=0; col<BOARD_DIMENTION; col++)
			{
				output += board[row][col];
			}
			output += "\n";
		}
		return output; 
	}
}
