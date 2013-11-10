package gamelogictests;

import static org.junit.Assert.*;
import gamelogic.Board;

import org.junit.Test;

public class BoardTest
{
	
	@Test
	public void testBoardCreation()
	{
		Board board = new Board(10);
		
		assertTrue(board.getCells().length == 10);
		
		for(int i = 0; i < board.getCells().length; ++i)
		{
			assertTrue(board.getCells()[i].length == 10);
		}
	}
}
