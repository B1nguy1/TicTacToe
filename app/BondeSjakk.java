package app;

public class BondeSjakk {
	private String currentPlayer;
	private String farge;
	
	public BondeSjakk() {
		currentPlayer = "x";
	}
	
	public void changePlayer() {
		if(currentPlayer.equals("x")) {
			currentPlayer = "o";
			this.farge = "-fx-text-fill:blue";
		}
		else {
		currentPlayer = "x";
		this.farge = "-fx-text-fill:red";
		}}
	
	
	public void setCurrentPlayer(String currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	
	public String getFarge() {
		return farge;
	}

	public String getCurrentPlayer() {
		return currentPlayer;
	}
}
