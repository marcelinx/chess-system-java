package application;

import chess.chessMatch;

public class Program {

	public static void main(String[] args) {
	
		chessMatch chessMatch1 = new chessMatch();
		UI.printBoard(chessMatch1.getpieces());
	}

}
