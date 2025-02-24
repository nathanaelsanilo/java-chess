package com.academy.app;

public class Pawn extends Piece {

    private int currentRow;
    private int currentCol;

    public Pawn(int xPos, int yPos, PieceColor color) {
        super(xPos, yPos, color);
        this.currentRow = xPos;
        this.currentCol = yPos;
    }

    public int[] move() {
        currentRow++;
        return new int[] { currentCol, currentRow };
    }

    @Override
    public boolean isValidMove(int newRow) {
        return newRow - currentRow == 1;
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
