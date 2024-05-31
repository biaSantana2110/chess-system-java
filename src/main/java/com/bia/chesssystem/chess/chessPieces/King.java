package com.bia.chesssystem.chess.chessPieces;

import com.bia.chesssystem.boardgame.Board;
import com.bia.chesssystem.chess.ChessPiece;
import com.bia.chesssystem.chess.Color;

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
