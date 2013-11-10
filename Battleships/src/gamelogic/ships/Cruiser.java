package gamelogic.ships;

import gamelogic.Board;
import gamelogic.resources.ShipResources;

public class Cruiser extends Ship
{

	public Cruiser(Board b, int x, int y, ShipVector vector)
	{
		super(b, x, y, vector);
		this._shipTypeKey = ShipResources.CruiserTypeKey;
		this._size = 3;
	}
	
}