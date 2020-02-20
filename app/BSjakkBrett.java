package app;

public class BSjakkBrett {
	private String[][] board;

	public BSjakkBrett() {
		this.board = new String[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.board[i][j] = "";

			}
		}
	}

	public boolean isValidMove(int x, int y) {
		return (board[x][y].equals(""));
	}

	// Oppdaterer brettet
	public void updateBoard(int x, int y, String player) {
		this.board[x][y] = player;
	}

	// Sjekker om brettet er fylt opp med brikker
	public boolean isBoardFull() {
		boolean iFull = true;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j].equals("")) {
					iFull = false;
				}
			}
		}
		return iFull;
	}

	private boolean checkRows() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0].equals("x") && board[i][1].equals("x") && board[i][2].equals("x")) {
				return true;
			} else if (board[i][0].equals("o") && board[i][1].equals("o") && board[i][2].equals("o")) {
				return true;
			}
		}
		return false;
	}

	private boolean checkColumns() {
		for (int i = 0; i < 3; i++) {
			if (board[0][i].equals("x") && board[1][i].equals("x") && board[2][i].equals("x")) {
				return true;
			} else if (board[0][i].equals("o") && board[1][i].equals("o") && board[2][i].equals("o")) {
				return false;
			}
		}
		return false;
	}

	private boolean checkDiagonals() {
		if (board[0][0].equals("x") && board[1][1].equals("x") && board[2][2].equals("x")) {
			return true;
		} else if (board[0][0].equals("o") && board[1][1].equals("o") && board[2][2].equals("o")) {
			return true;
		} else if (board[0][2].equals("x") && board[1][1].equals("x") && board[2][0].equals("x")) {
			return true;
		} else if (board[0][2].equals("o") && board[1][1].equals("o") && board[2][0].equals("o")) {
			return true;
		}
		return false;
	}

	public boolean checkWinner() {
		return checkRows() || checkColumns() || checkDiagonals();
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}
}
