package gamelogic;

import gamelogic.exceptions.CellIsOutOfBoundsException;

public class Board
{
	private Cell _Cells[][];
	private int _size;
	
	public Cell[][] getCells()
	{
		return this._Cells;
	}
	
	public int getSize()
	{
		return this._size;
	}
	
	public Board(int bound)
	{
		this._size = bound;
		this._Cells = new Cell[this._size][this._size];
		
		for(int x = 0; x < this._size; ++x)
			for(int y = 0; y < this._size; ++y)
				this._Cells[x][y] = new Cell(x, y);
	}

	public Cell getCell(int x, int y) throws CellIsOutOfBoundsException
	{
		if((x >= 0) && (y >= 0) && (x < this._size) && (y < this._size))
		{
			return this._Cells[x][y];
		}
		else
		{
			throw new CellIsOutOfBoundsException();
		}
	}
}
