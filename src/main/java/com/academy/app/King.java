package com.academy.app;

public class King extends Piece {

    public King(int xPos, int yPos, PieceColor color) {
        super(xPos, yPos, color);
    }

    @Override
    public String toString() {
        if (this.getColor() == PieceColor.BLACK) {
            return "BK";
        } else {
            return "WK";
        }
    }
}
