package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		
		this.board = board;
		position = null;
		
	}

	/* protected, apenas classes membros do mesmo pacote podem acessar o board */
	protected Board getBoard() {
		return board;
	}

	

}
