package gamelogictests;

import static org.junit.Assert.*;
import javax.naming.OperationNotSupportedException;
import gamelogic.Board;
import gamelogic.Cell;
import gamelogic.exceptions.CellIsOutOfBoundsException;
import gamelogic.ships.Battleship;
import gamelogic.ships.Cruiser;
import gamelogic.ships.Destroyer;
import gamelogic.ships.Mine;
import gamelogic.ships.Minesweeper;
import gamelogic.ships.Ship.ShipVector;
import gamelogic.ships.Submarine;

import org.junit.Test;

public class ShipTest
{
	private static final int boardSize = 16;
	
	@Test
	public void testBattleshipCreation() 
			throws CellIsOutOfBoundsException, OperationNotSupportedException
	{
		Battleship ship = new Battleship(new Board(boardSize), 1, 1, ShipVector.Right);
		
		assertTrue("Battleship size is not 4.", ship.getSize() == 4);
		assertTrue("Battleship doesn't have a class type key.", ship.getShipTypeKey() != "");
		assertTrue("Battleship must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Battleship must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testCruiserCreation() 
			throws CellIsOutOfBoundsException, OperationNotSupportedException
	{
		Cruiser ship = new Cruiser(new Board(boardSize), 1, 1, ShipVector.Right);
		
		assertTrue("Cruiser size is not 3.", ship.getSize() == 3);
		assertTrue("Cruiser must have a class type.", ship.getShipTypeKey() != "");
		assertTrue("Cruiser must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Cruiser must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testDestroyerCreation() 
			throws CellIsOutOfBoundsException, OperationNotSupportedException
	{
		Destroyer ship = new Destroyer(new Board(boardSize), 1, 1, ShipVector.Right);
		
		assertTrue("Destroyer size is not 2.", ship.getSize() == 2);
		assertTrue("Destroyer must have a class type.", ship.getShipTypeKey() != "");
		assertTrue("Destroyer must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Destroyer must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testSubmarineCreation() 
			throws CellIsOutOfBoundsException, OperationNotSupportedException
	{
		Submarine ship = new Submarine(new Board(boardSize), 1, 1, ShipVector.Right);
		
		assertTrue("Submarine size is not 1.", ship.getSize() == 1);
		assertTrue("Submarine must have a class type.", ship.getShipTypeKey() != "");
		assertTrue("Submarine must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Submarine must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testMineCreation() 
			throws CellIsOutOfBoundsException, OperationNotSupportedException
	{
		Mine ship = new Mine(new Board(boardSize), 1, 1, ShipVector.Right);
		
		assertTrue("Mine size is not 1.", ship.getSize() == 1);
		assertTrue("Mine must have a class type.", ship.getShipTypeKey() != "");
		assertTrue("Mine must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Mine must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testMinesweeperCreation() 
			throws CellIsOutOfBoundsException, OperationNotSupportedException
	{
		Minesweeper ship = new Minesweeper(new Board(boardSize), 1, 1, ShipVector.Right);
		
		assertTrue("Minesweeper size is 0.", ship.getSize() == 1);
		assertTrue("Minesweeper must have a class type.", ship.getShipTypeKey() != "");
		assertTrue("Minesweeper must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Minesweeper must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testCannotPlaceBattleshipOutsideTheGridNegativeX()
		throws OperationNotSupportedException
	{
		Board board = new Board(boardSize);
		Exception ex = null;
		
		try
		{
			new Battleship(board, -1, 1, ShipVector.Up);
		}
		catch(Exception testEx)
		{
			ex = testEx;
		}
		
		assertNotNull("Able to create ship with negative x.", ex);
		assertTrue("Received exception of unexpected type when creating ship with negative x.", ex instanceof CellIsOutOfBoundsException);
	}
	
	@Test
	public void testCannotPlaceBattleshipOutsideTheGridNegativeY()
			throws OperationNotSupportedException
	{
		Board board = new Board(boardSize);
		Exception ex = null;
		
		try
		{
			new Battleship(board, 1, -1, ShipVector.Up);
		}
		catch(Exception testEx)
		{
			ex = testEx;
		}
		
		assertNotNull("Able to create ship with negative y.", ex);
		assertTrue("Received exception of unexpected type when creating ship with negative y.", ex instanceof CellIsOutOfBoundsException);
	}
	
	@Test
	public void testCannotPlaceBattleshipBowInsideVectorAndSizeNegativeX()
			throws OperationNotSupportedException
	{
		Board board = new Board(boardSize);
		Exception ex = null;
		
		try
		{
			new Battleship(board, 1, 1, ShipVector.Left);
		}
		catch(Exception testEx)
		{
			ex = testEx;
		}
		
		assertNotNull("Able to create ship that will be able to span in negative x.", ex);
		assertTrue("Received exception of unexpected type when creating ship tahat spans in negative x.", ex instanceof CellIsOutOfBoundsException);
	}
}
