package com.academy.app;

public class Horse extends Piece {

    public Horse(int xPos, int yPos, PieceColor color) {
        super(xPos, yPos, color);
    }

    @Override
    public String toString() {
        if (this.getColor() == PieceColor.BLACK) {
            return "BH";
        } else {
            return "WH";
        }
    }

    @Override
    public boolean isValidMove(int col, int row) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValidMove'");
    }
}
