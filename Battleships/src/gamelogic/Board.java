package gamelogic;

public class Board
{
	private Cell _Cells[][];
	
	public Cell[][] getCells()
	{
		return _Cells;
	}
	
	public Board(int xBound, int yBound)
	{
		this._Cells = new Cell[yBound][xBound];
	}

	public Cell getCell(int x, int y)
	{
		return (((x >= 0) && (y >= 0) && (y < this._Cells.length) && (x < this._Cells[0].length)) ? this._Cells[y][x]
				: null);
	}
}
