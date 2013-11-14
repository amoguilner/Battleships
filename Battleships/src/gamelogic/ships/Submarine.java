package gamelogic.ships;

import gamelogic.Board;
import gamelogic.exceptions.CellIsOutOfBoundsException;
import gamelogic.resources.ShipResources;

public class Submarine extends Ship
{

	public Submarine(Board b, int x, int y, ShipVector vector) throws CellIsOutOfBoundsException
	{
		super(b, x, y, vector);
		this._shipTypeKey = ShipResources.SubmarineTypeKey;
		this._size = 1;
	}
	
}
