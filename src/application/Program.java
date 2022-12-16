package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import application.UI;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
	}

}
