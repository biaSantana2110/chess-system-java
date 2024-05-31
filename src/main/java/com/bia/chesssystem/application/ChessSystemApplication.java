package com.bia.chesssystem.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bia.chesssystem.chess.ChessException;
import com.bia.chesssystem.chess.ChessMatch;
import com.bia.chesssystem.chess.ChessPiece;
import com.bia.chesssystem.chess.ChessPosition;

@SpringBootApplication
public class ChessSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessSystemApplication.class, args);
		Scanner sc = new Scanner(System.in);

		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			try{
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			boolean[][] possibleMoves = chessMatch.possibleMoves(source);
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces(), possibleMoves);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

		}catch(ChessException e){
			System.out.println(e.getMessage());
			sc.nextLine();
		}
		catch(InputMismatchException e){
			System.out.println(e.getMessage());
			sc.nextLine();
		}

		}
	}

}