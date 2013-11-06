package gamelogictests;

import static org.junit.Assert.*;
import gamelogic.Ship;
import gamelogic.Ship.ShipVector;

import org.junit.Test;

public class ShipTest
{
	
	@Test
	public void testShipCreation()
	{
		Ship ship = new Ship();
		
		assertTrue("Ship size is 0.", ship.getSize() > 0);
		assertTrue("Ship must have a class type.", ship.getShipType() != "");
		assertTrue("Ship must have start point.", ship.getBow() instanceof Object);
		assertTrue("Ship must have vector.", ship.getVector() instanceof ShipVector);
	}
	
}
