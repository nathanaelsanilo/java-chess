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

    @Override
    public boolean isValidMove(int row, int col) {
        boolean val = col >= 0 || col <= 7 || row >= 0 || row <= 7;
        if (!val) {
            System.out.println("Invalid move!");
        }

        return val;
    }
}
