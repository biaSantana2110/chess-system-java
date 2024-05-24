package bia.com.chess_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import bia.com.chess_system.Boardgame.Position;

@SpringBootApplication
public class ChessSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessSystemApplication.class, args);
	
	Position pos = new Position(3, 5);
	
		System.out.println(pos);
	
	}


}
