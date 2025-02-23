package com.academy.app;

public class Queen extends Piece {

    public Queen(int xPos, int yPos, PieceColor color) {
        super(xPos, yPos, color);
    }

    @Override
    public String toString() {
        if (this.getColor() == PieceColor.BLACK) {
            return "BQ";
        } else {
            return "WQ";
        }
    }
}
