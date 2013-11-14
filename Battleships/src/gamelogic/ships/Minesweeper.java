package gamelogic.ships;

import gamelogic.Board;
import gamelogic.exceptions.CellIsOutOfBoundsException;
import gamelogic.resources.ShipResources;

public class Minesweeper extends Ship
{

	public Minesweeper(Board b, int x, int y, ShipVector vector) throws CellIsOutOfBoundsException
	{
		super(b, x, y, vector);
		this._shipTypeKey=ShipResources.MinesweeperTypeKey;
		this._size = 1;
	}
	
}
