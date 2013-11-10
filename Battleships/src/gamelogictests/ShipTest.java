package gamelogictests;

import static org.junit.Assert.*;
import gamelogic.Board;
import gamelogic.Cell;
import gamelogic.ships.Battleship;
import gamelogic.ships.Cruiser;
import gamelogic.ships.Destroyer;
import gamelogic.ships.Mine;
import gamelogic.ships.Minesweeper;
import gamelogic.ships.Ship;
import gamelogic.ships.Ship.ShipVector;
import gamelogic.ships.Submarine;

import org.junit.Test;

public class ShipTest
{
	@Test
	public void testBattleshipCreation()
	{
		Ship ship = new Battleship(new Board(10), 1, 1, ShipVector.Right);
		
		assertTrue("Battleship size is not 4.", ship.getSize() == 4);
		assertTrue("Battleship doesn't have a class type key.", ship.getShipTypeKey() != "");
		assertTrue("Battleship must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Battleship must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testCruiserCreation()
	{
		Ship ship = new Cruiser(new Board(10), 1, 1, ShipVector.Right);
		
		assertTrue("Cruiser size is not 3.", ship.getSize() == 3);
		assertTrue("Cruiser must have a class type.", ship.getShipTypeKey() != "");
		assertTrue("Cruiser must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Cruiser must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testDestroyerCreation()
	{
		Ship ship = new Destroyer(new Board(10), 1, 1, ShipVector.Right);
		
		assertTrue("Destroyer size is not 2.", ship.getSize() == 2);
		assertTrue("Destroyer must have a class type.", ship.getShipTypeKey() != "");
		assertTrue("Destroyer must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Destroyer must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testSubmarineCreation()
	{
		Ship ship = new Submarine(new Board(10), 1, 1, ShipVector.Right);
		
		assertTrue("Submarine size is not 1.", ship.getSize() == 1);
		assertTrue("Submarine must have a class type.", ship.getShipTypeKey() != "");
		assertTrue("Submarine must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Submarine must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testMineCreation()
	{
		Ship ship = new Mine(new Board(10), 1, 1, ShipVector.Right);
		
		assertTrue("Mine size is not 1.", ship.getSize() == 1);
		assertTrue("Mine must have a class type.", ship.getShipTypeKey() != "");
		assertTrue("Mine must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Mine must have vector.", ship.getVector() instanceof ShipVector);
	}
	
	@Test
	public void testMinesweeperCreation()
	{
		Ship ship = new Minesweeper(new Board(10), 1, 1, ShipVector.Right);
		
		assertTrue("Minesweeper size is 0.", ship.getSize() == 1);
		assertTrue("Minesweeper must have a class type.", ship.getShipTypeKey() != "");
		assertTrue("Minesweeper must have start point.", ship.getBow() instanceof Cell);
		assertTrue("Minesweeper must have vector.", ship.getVector() instanceof ShipVector);
	}
}
