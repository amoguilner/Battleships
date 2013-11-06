package gamelogic;

public class Player
{
	public Board _MyBoard;
	public Board _EnemyBoard;
	
	public Board getMyBoard()
	{
		return _MyBoard;
	}
	
	public Board getEnemyBoard()
	{
		return _EnemyBoard;
	}
	
	private Player()
	{
		this._MyBoard = new Board();  //wrong -- boards are shared between players.
		this._EnemyBoard = new Board();
	}
}
