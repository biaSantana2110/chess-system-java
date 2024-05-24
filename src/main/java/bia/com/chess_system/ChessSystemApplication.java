package bia.com.chess_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import bia.com.chess_system.Boardgame.Board;


@SpringBootApplication
public class ChessSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessSystemApplication.class, args);
	
		Board board = new Board(8, 8);
	
	}


}
