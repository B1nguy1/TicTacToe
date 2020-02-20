package app;

public class BondeSjakk {
	private String currentPlayer;
	private String farge;
	private String playerNr;

	public BondeSjakk() {
		currentPlayer = "x";
	}

	public void changePlayer() {
		String red = "-fx-text-fill:red";
		String blue = "-fx-text-fill:blue";
		String player1 = "Player 1";
		String player2 = "Player 2";

		if (currentPlayer.equals("x")) {
			currentPlayer = "o";
			this.farge = blue;
			this.playerNr = player1;
		} else {
			currentPlayer = "x";
			this.farge = red;
			this.playerNr = player2;
		}
	}

	public String getPlayerNr() {
		return this.playerNr;
	}

	public void setCurrentPlayer(String currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public String getFarge() {
		return this.farge;
	}

	public String getCurrentPlayer() {
		return currentPlayer;
	}
}
