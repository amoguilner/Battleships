package gamelogic.ships;

import gamelogic.Board;
import gamelogic.resources.ShipResources;

public class Mine extends Ship
{

	public Mine(Board b, int x, int y, ShipVector vector)
	{
		super(b, x, y, vector);
		this._shipTypeKey = ShipResources.MineTypeKey;
		this._size = 1;
	}
	
}
