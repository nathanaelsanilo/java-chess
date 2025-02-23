package com.academy.app;

public class Pawn extends Piece {

    public Pawn(int xPos, int yPos, PieceColor color) {
        super(xPos, yPos, color);
    }

    @Override
    public boolean isValidMove(int newX, int newY) {
        return true;
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
