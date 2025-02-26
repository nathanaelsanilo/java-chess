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
    public boolean isValidMove(int row, int col) {
        System.out.println("Pawn position " + getXPos() + getYPos());
        System.out.println("row" + row + " col" + col);
        boolean val = getXPos() - row <= 2 && col == getYPos();

        if (!val) {
            System.out.println("Invalid move!");
        }

        return val;

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
