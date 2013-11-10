package gamelogic.Exceptions;

public class CellIsOutOfBoundsException extends Exception
{
	/**
	 * Generated serialVersionUID by Eclipse
	 */
	private static final long serialVersionUID = 2283113209531099500L;

	public CellIsOutOfBoundsException(String message)
	{
		super("Cell is outside of the board." + message);
	}
}
