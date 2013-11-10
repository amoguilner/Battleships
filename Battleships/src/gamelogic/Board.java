package gamelogic;

public class Board
{
	private Cell _Cells[][];
	
	public Cell[][] getCells()
	{
		return _Cells;
	}
	
	public Board(int bound)
	{
		this._Cells = new Cell[bound][bound];
		
		for(int x = 0; x < bound; ++x)
			for(int y = 0; y < bound; ++y)
				this._Cells[x][y] = new Cell(x, y);
	}

	public Cell getCell(int x, int y)
	{
		return (((x >= 0) && (y >= 0) && (x < this._Cells.length) && (y < this._Cells[0].length)) ? this._Cells[x][y]
				: null);
	}
}
