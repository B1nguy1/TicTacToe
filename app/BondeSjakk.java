package app;

public class BondeSjakk {
	private String currentPlayer;
	
	public BondeSjakk() {
		currentPlayer = "x";
	}
	
	public void changePlayer() {
		if(currentPlayer.equals("x")) {
			currentPlayer = "o";
		}
		else {
		currentPlayer = "x";
		}}
	
	public void setCurrentPlayer(String currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public String getCurrentPlayer() {
		return currentPlayer;
	}
}

