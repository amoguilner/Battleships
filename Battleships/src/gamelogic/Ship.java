package gamelogic;

public class Ship
{
	private int _size;
	private String _shipType;
	private Cell _bow;
	private ShipVector _vector;
	
	public int getSize()
	{
		return _size;
	}
	
	public String getShipType()
	{
		return _shipType;
	}

	public Cell getBow()
	{
		return _bow;
	}

	public ShipVector getVector()
	{
		return _vector;
	}
	
	public Ship(Board b, int x, int y, ShipVector vector)
	{
		this._size = 1;
		this._shipType = "Abstract Ship";
		this._bow = b.getCell(x, y);
		this._vector = ShipVector.Up;
	}
	
	public enum ShipVector { Up, Down, Left, Right};
}
