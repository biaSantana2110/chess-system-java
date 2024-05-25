package com.bia.chess_system.chess;

import com.bia.chess_system.boardgame.Board;
import com.bia.chess_system.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

}
