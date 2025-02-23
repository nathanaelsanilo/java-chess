package com.academy.app;

public class Bishop extends Piece {

    public Bishop(int xPos, int yPos, PieceColor color) {
        super(xPos, yPos, color);
    }

    @Override
    public String toString() {
        if (this.getColor() == PieceColor.BLACK) {
            return "BB";
        } else {
            return "WB";
        }
    }

}
