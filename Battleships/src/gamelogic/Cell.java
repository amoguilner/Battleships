package gamelogic;

public class Cell
{
	private int _x;
	private int _y;
	private Boolean _Revealed;
	private Boolean _Occupied;
	
	public int getX()
	{
		return this._x;
	}

	public int getY()
	{
		return this._y;
	}

	public Boolean isRevealed()
	{
		return this._Revealed;
	}

	public void setRevealed(Boolean revealed)
	{
		this._Revealed = revealed;
	}
	
	public Boolean isOccupied()
	{
		return this._Occupied;
	}
	
	public void setOccupied(Boolean occupied)
	{
		this._Occupied = occupied;
	}

	public Cell(int x, int y)
	{
		this._x = x;
		this._y = y;
		this._Revealed = false;
		this._Occupied = false;
	}
	
	
}
