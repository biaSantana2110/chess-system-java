package com.bia.chesssystem.chess;

import com.bia.chesssystem.boardgame.Board;
import com.bia.chesssystem.boardgame.Piece;
import com.bia.chesssystem.boardgame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p !=null && p.getColor() !=color;
    }


}