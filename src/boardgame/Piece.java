package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Position pisition, Board board) {
		this.board = board;
		position = null;
	}


	public Board getBoard() {
		return board;
	}
}