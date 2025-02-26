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

    @Override
    public boolean isValidMove(int col, int row) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValidMove'");
    }
}
