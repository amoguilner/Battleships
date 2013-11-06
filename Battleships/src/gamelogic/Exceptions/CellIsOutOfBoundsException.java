package gamelogic.Exceptions;

public class CellIsOutOfBoundsException extends Exception
{
	public CellIsOutOfBoundsException(String message)
	{
		super("Cell is outside of the board." + message);
	}
}
