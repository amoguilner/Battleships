package gamelogic.ships;

import gamelogic.Board;
import gamelogic.Cell;
import gamelogic.exceptions.CellIsOutOfBoundsException;

import java.util.ResourceBundle;

import javax.naming.OperationNotSupportedException;

public abstract class Ship
{
	protected int _size;
	protected String _shipTypeKey;
	private Cell _bow;
	private Cell _cells[];
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
	
	public Cell[] getCells()
	{
		return this._cells;
	}

	public ShipVector getVector()
	{
		return this._vector;
	}
	
	protected Ship(Board b, int x, int y, ShipVector vector, int size, String shipTypeKey) 
			throws CellIsOutOfBoundsException, OperationNotSupportedException
	{
		this._bow = b.getCell(x, y);
		this._vector = vector;
		this._size = size;
		this._shipTypeKey = shipTypeKey;
		this._cells = new Cell[this._size];
		
		try
		{
			for(int i = 0; i < this.getSize(); ++i)
			{
				this._cells[i] = this.getShipCellAtPosition(i, b);
				this._cells[i].setOccupied(true);
			}
		}
		catch (CellIsOutOfBoundsException ex)
		{
			throw new CellIsOutOfBoundsException();
		}
	}
	
	private Cell getShipCellAtPosition(int offset, Board board) throws CellIsOutOfBoundsException
	{
		if (offset > this.getSize())
			throw new CellIsOutOfBoundsException("Cell offset is higher than ship size.");
		
		int x;
		int y;
		Cell bow = this.getBow();
		
		switch(this.getVector())
		{
			case Down:
			{
				x = bow.getX();
				y = bow.getY() + offset;
			}
			break;
			
			case Up:
			{
				x = bow.getX();
				y = bow.getY() - offset;
			}
			break;
			
			case Left:
			{
				x = bow.getX() - offset;
				y = bow.getY();
			}
			break;
			
			case Right:
			{
				x = bow.getX() + offset;
				y = bow.getY();
			}
			break;
			
			default:
				throw new UnsupportedOperationException("Vector " + this.getVector().toString() + " is not supported.");
		}
		
		return board.getCell(x, y);
	}
		
	public enum ShipVector { Up, Down, Left, Right};
}
