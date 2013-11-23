package gamelogic.ships;

import javax.naming.OperationNotSupportedException;

import gamelogic.Board;
import gamelogic.exceptions.CellIsOutOfBoundsException;
import gamelogic.resources.ShipResources;

public class Mine extends Ship
{

	public Mine(Board b, int x, int y, ShipVector vector) 
			throws CellIsOutOfBoundsException, OperationNotSupportedException
	{
		super(b, x, y, vector, 1, ShipResources.MineTypeKey);
	}
	
}
