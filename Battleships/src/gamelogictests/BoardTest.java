package gamelogictests;

import static org.junit.Assert.*;
import gamelogic.Board;

import org.junit.Test;

public class BoardTest
{
	
	@Test
	public void testBoardCreation()
	{
		final int boardSize = 16;
		Board board = new Board(boardSize);
		
		assertTrue(board.getCells().length == boardSize);
		
		for(int i = 0; i < board.getCells().length; ++i)
		{
			assertTrue(board.getCells()[i].length == boardSize);
		}
	}
}
