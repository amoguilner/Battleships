package gamelogic.ships;

import gamelogic.Board;
import gamelogic.resources.ShipResources;

public class Battleship extends Ship
{
	public Battleship(Board b, int x, int y, ShipVector vector)
	{
		super(b, x, y, vector);
		this._shipTypeKey = ShipResources.BattleshipTypeKey;
		this._size = 4;
	}
}
