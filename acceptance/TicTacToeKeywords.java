import edu.jsu.mcis.*;

import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	private TicTacToe t;
	
	public void startNewGame() {
		t = new TicTacToe();
		t.ClearBoard();
		t.turns = 0;
		t.who = 'X';
	}
	
	public void markLocation(int row, int col) {
		t.Mark(row, col);
	}
	
	public String getMark(int row, int col) {
		return t.GetMark(row,col);

	}
		 
	public String getWinner() {
		t.GetWinner();
		return t.Winner();
	}
}
