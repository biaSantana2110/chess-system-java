package bia.com.chess_system.Chess;

import bia.com.chess_system.Boardgame.Board;
import bia.com.chess_system.Boardgame.Piece;

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
