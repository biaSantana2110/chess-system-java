package com.bia.chess_system.chess.chessPieces;

import com.bia.chess_system.boardgame.Board;
import com.bia.chess_system.chess.ChessPiece;
import com.bia.chess_system.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);

    }
    @Override
    public String toString(){
        return "R";
    }

}
