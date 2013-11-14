package gamelogic.exceptions;

public class CellIsOutOfBoundsException extends Exception
{
	/**
	 * Generated serialVersionUID by Eclipse
	 */
	private static final long serialVersionUID = 2283113209531099500L;
	
	public CellIsOutOfBoundsException()
	{
		super("Cell is outside of the board.");
	}

	public CellIsOutOfBoundsException(String message)
	{
		super("Cell is outside of the board." + message);
	}
}
