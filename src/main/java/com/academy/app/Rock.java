package com.academy.app;

public class Rock extends Piece {

    public Rock(int xPos, int yPos, PieceColor color) {
        super(xPos, yPos, color);
    }

    @Override
    public String toString() {
        if (this.getColor() == PieceColor.BLACK) {
            return "BR";
        } else {
            return "WR";
        }
    }
}
