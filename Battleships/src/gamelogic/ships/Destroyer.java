package gamelogic.ships;

import gamelogic.Board;
import gamelogic.exceptions.CellIsOutOfBoundsException;
import gamelogic.resources.ShipResources;

public class Destroyer extends Ship
{

	public Destroyer(Board b, int x, int y, ShipVector vector) throws CellIsOutOfBoundsException
	{
		super(b, x, y, vector);
		this._shipTypeKey = ShipResources.DestroyerTypeKey;
		this._size = 2;
	}
	
}
