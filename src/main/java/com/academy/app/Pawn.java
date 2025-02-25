package com.academy.app;

public class Pawn extends Piece {

    public Pawn(int xPos, int yPos, PieceColor color) {
        super(xPos, yPos, color);
    }

    public int[] move() {
        setYPos(getYPos() + 1);
        return new int[] { getXPos(), getYPos() };
    }

    @Override
    public boolean isValidMove(int col, int row) {
        return row == getYPos() && col - getXPos() <= 2;
    }

    @Override
    public String toString() {
        if (this.getColor() == PieceColor.BLACK) {
            return "BP";
        } else {
            return "WP";
        }
    }
}
