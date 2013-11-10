package gamelogic.ships;

import gamelogic.Board;
import gamelogic.Cell;

import java.util.ResourceBundle;

public abstract class Ship
{
	protected int _size;
	protected String _shipTypeKey;
	private Cell _bow;
	private ShipVector _vector;
	
	public int getSize()
	{
		return this._size;
	}
	
	public String getShipTypeKey()
	{
		return this._shipTypeKey;
	}
	
	public String getShipType(ResourceBundle messages)
	{
		return messages.getString(this._shipTypeKey);
	}

	public Cell getBow()
	{
		return this._bow;
	}

	public ShipVector getVector()
	{
		return this._vector;
	}
	
	public Ship(Board b, int x, int y, ShipVector vector)
	{
		this._bow = b.getCell(x, y);
		this._vector = vector;
	}
	
	public enum ShipVector { Up, Down, Left, Right};
}
