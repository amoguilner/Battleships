package gamelogic.ships;

import javax.naming.OperationNotSupportedException;

import gamelogic.Board;
import gamelogic.exceptions.CellIsOutOfBoundsException;
import gamelogic.resources.ShipResources;

public class Cruiser extends Ship
{

	public Cruiser(Board b, int x, int y, ShipVector vector) 
			throws CellIsOutOfBoundsException, OperationNotSupportedException
	{
		super(b, x, y, vector, 3, ShipResources.CruiserTypeKey);
	}
	
}
