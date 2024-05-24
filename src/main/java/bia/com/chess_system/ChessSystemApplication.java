package bia.com.chess_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import bia.com.chess_system.Chess.ChessMatch;


@SpringBootApplication
public class ChessSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessSystemApplication.class, args);
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	
	}


}
