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
	
	private Player(Board myBoard, Board enemyBoard)
	{
		this._MyBoard = myBoard;
		this._EnemyBoard = enemyBoard;
	}
}
