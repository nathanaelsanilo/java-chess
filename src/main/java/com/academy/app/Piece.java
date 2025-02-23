package com.academy.app;

public class Piece {
    private int xPos;
    private int yPos;
    private PieceColor color;

    public Piece(int xPos, int yPos, PieceColor color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public PieceColor getColor() {
        return color;
    }

    public void setColor(PieceColor color) {
        this.color = color;
    }

    public boolean isValidMove(int newX, int newY) {
        return true;
    };

}
