package app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BSjakkController {
	BSjakkBrett bsjakkbrett;
	BondeSjakk bondesjakk;
	@FXML
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, exit;
	@FXML
	Label knapp;

	@FXML
	public void initialize() {
		bsjakkbrett = new BSjakkBrett();
		bondesjakk = new BondeSjakk();
	}

	@FXML
	public void knapp1() {
		if (bsjakkbrett.isValidMove(0, 0) && !bsjakkbrett.checkWinner()) {
			bsjakkbrett.updateBoard(0, 0, bondesjakk.getCurrentPlayer());
			b1.setText(bondesjakk.getCurrentPlayer());
			bondesjakk.changePlayer();
			b1.setStyle(bondesjakk.getFarge());
			consolWinner();
		}
	}

	@FXML
	public void knapp2() {
		if (bsjakkbrett.isValidMove(0, 1) && !bsjakkbrett.checkWinner()) {
			bsjakkbrett.updateBoard(0, 1, bondesjakk.getCurrentPlayer());
			b2.setText(bondesjakk.getCurrentPlayer());
			bondesjakk.changePlayer();
			b2.setStyle(bondesjakk.getFarge());
			consolWinner();
		}
	}

	@FXML
	public void knapp3() {
		if (bsjakkbrett.isValidMove(0, 2) && !bsjakkbrett.checkWinner()) {
			bsjakkbrett.updateBoard(0, 2, bondesjakk.getCurrentPlayer());
			b3.setText(bondesjakk.getCurrentPlayer());
			bondesjakk.changePlayer();
			b3.setStyle(bondesjakk.getFarge());
			consolWinner();
		}
	}

	@FXML
	public void knapp4() {
		if (bsjakkbrett.isValidMove(1, 0) && !bsjakkbrett.checkWinner()) {
			bsjakkbrett.updateBoard(1, 0, bondesjakk.getCurrentPlayer());
			b4.setText(bondesjakk.getCurrentPlayer());
			bondesjakk.changePlayer();
			b4.setStyle(bondesjakk.getFarge());
			consolWinner();
		}
	}

	@FXML
	public void knapp5() {
		if (bsjakkbrett.isValidMove(1, 1) && !bsjakkbrett.checkWinner()) {
			bsjakkbrett.updateBoard(1, 1, bondesjakk.getCurrentPlayer());
			b5.setText(bondesjakk.getCurrentPlayer());
			bondesjakk.changePlayer();
			b5.setStyle(bondesjakk.getFarge());
			consolWinner();
		}
	}

	@FXML
	public void knapp6() {
		if (bsjakkbrett.isValidMove(1, 2) && !bsjakkbrett.checkWinner()) {
			bsjakkbrett.updateBoard(1, 2, bondesjakk.getCurrentPlayer());
			b6.setText(bondesjakk.getCurrentPlayer());
			bondesjakk.changePlayer();
			b6.setStyle(bondesjakk.getFarge());
			consolWinner();
		}
	}

	@FXML
	public void knapp7() {
		if (bsjakkbrett.isValidMove(2, 0) && !bsjakkbrett.checkWinner()) {
			bsjakkbrett.updateBoard(2, 0, bondesjakk.getCurrentPlayer());
			b7.setText(bondesjakk.getCurrentPlayer());
			bondesjakk.changePlayer();
			b7.setStyle(bondesjakk.getFarge());
			consolWinner();
		}
	}

	@FXML
	public void knapp8() {
		if (bsjakkbrett.isValidMove(2, 1) && !bsjakkbrett.checkWinner()) {
			bsjakkbrett.updateBoard(2, 1, bondesjakk.getCurrentPlayer());
			b8.setText(bondesjakk.getCurrentPlayer());
			bondesjakk.changePlayer();
			b8.setStyle(bondesjakk.getFarge());
			consolWinner();
		}
	}

	@FXML
	public void knapp9() {
		if (bsjakkbrett.isValidMove(2, 2) && !bsjakkbrett.checkWinner()) {
			bsjakkbrett.updateBoard(2, 2, bondesjakk.getCurrentPlayer());
			b9.setText(bondesjakk.getCurrentPlayer());
			bondesjakk.changePlayer();
			b9.setStyle(bondesjakk.getFarge());
			consolWinner();
		}
	}

	@FXML
	public void consolWinner() {
		if (bsjakkbrett.checkWinner()) {
			knapp.setText(bondesjakk.getPlayerNr() + " " + "won this game!!");
			knapp.setStyle("-fx-text-fill:#00ff00");
		} else if (bsjakkbrett.isBoardFull()) {
			knapp.setText("Uavgjort!");
			knapp.setStyle("-fx-text-fill:#ff9933");
		} else if (!(bsjakkbrett.checkWinner() && bsjakkbrett.isBoardFull())) {
			knapp.setText("");
		}
	}

	@FXML
	public void play() {
		Button[] buttons = { b1, b2, b3, b4, b5, b6, b7, b8, b9 };
		for (Button button : buttons) {
			button.setText(" ");
		}
		initialize();
	}

	@FXML
	public void exit() {
		System.exit(0);
	}
}
