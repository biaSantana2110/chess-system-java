package com.bia.chess_system.chess.chessPieces;

import com.bia.chess_system.boardgame.Board;
import com.bia.chess_system.chess.ChessPiece;
import com.bia.chess_system.chess.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; 
        return mat;
    }

}
