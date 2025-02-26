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

    @Override
    public boolean isValidMove(int col, int row) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValidMove'");
    }

}
