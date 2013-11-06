package gamelogictests;

import static org.junit.Assert.*;
import gamelogic.Cell;

import org.junit.Test;

public class CellTest
{
	
	@Test
	public void testCellCreation()
	{
		Cell cell = new Cell(2, 3);
		
		assertTrue(!cell.isRevealed());
		assertTrue(!cell.isOccupied());
		assertTrue(cell.getX() >= 0);
		assertTrue(cell.getY() >= 0);
	}
	
}
