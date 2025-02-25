package com.academy.app;

public class App {
    public Piece[][] board = new Piece[8][8];
    public Player[] players = new Player[] { new Player("Alpha"), new Player("Beta") };

    public static void main(String[] args) {
        App app = new App();
        app.initialize();
        app.printBoard();
        app.movePiece("e2", "e4");
    }

    public void printBoard() {
        for (Piece[] row : board) {
            for (Piece column : row) {
                if (column == null) {
                    System.out.print("-- ");
                } else {
                    System.out.print(column.toString() + " ");
                }
            }
            System.out.println();
        }
    }

    public void movePiece(String start, String end) {
        int[] startPos = Translator.translate(start);
        int[] endPos = Translator.translate(end);
        System.out.println("startPos = " + startPos[0] + " " + startPos[1]);
        System.out.println("endPos = " + endPos[0] + " " + endPos[1]);
        Pawn piece = (Pawn) board[startPos[0]][startPos[1]];
        board[endPos[0]][endPos[1]] = piece;
        board[startPos[0]][startPos[1]] = null;
        boolean isValidMove = piece.isValidMove(endPos[0], endPos[1]);
        System.out.println();
        System.out.println("isValidMove = " + isValidMove);
        System.out.println();
        printBoard();
    }

    public void initialize() {
        Rock bRock1 = new Rock(0, 0, PieceColor.BLACK);
        Rock bRock2 = new Rock(7, 0, PieceColor.BLACK);
        Rock wRock1 = new Rock(0, 7, PieceColor.WHITE);
        Rock wRock2 = new Rock(7, 7, PieceColor.WHITE);
        Horse bHorse1 = new Horse(1, 0, PieceColor.BLACK);
        Horse bHorse2 = new Horse(6, 0, PieceColor.BLACK);
        Horse wHorse1 = new Horse(1, 7, PieceColor.WHITE);
        Horse wHorse2 = new Horse(6, 7, PieceColor.WHITE);
        Bishop bBishop1 = new Bishop(2, 0, PieceColor.BLACK);
        Bishop bBishop2 = new Bishop(5, 0, PieceColor.BLACK);
        Bishop wBishop1 = new Bishop(2, 7, PieceColor.WHITE);
        Bishop wBishop2 = new Bishop(5, 7, PieceColor.WHITE);
        Queen bQueen = new Queen(3, 0, PieceColor.BLACK);
        Queen wQueen = new Queen(3, 7, PieceColor.WHITE);
        King bKing = new King(4, 0, PieceColor.BLACK);
        King wKing = new King(4, 7, PieceColor.WHITE);

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(1, i, PieceColor.BLACK);
            board[6][i] = new Pawn(6, i, PieceColor.WHITE);
        }

        board[0][0] = bRock1;
        board[0][7] = bRock2;
        board[7][0] = wRock1;
        board[7][7] = wRock2;
        board[0][1] = bHorse1;
        board[0][6] = bHorse2;
        board[7][1] = wHorse1;
        board[7][6] = wHorse2;
        board[0][2] = bBishop1;
        board[0][5] = bBishop2;
        board[7][2] = wBishop1;
        board[7][5] = wBishop2;
        board[0][3] = bQueen;
        board[7][3] = wQueen;
        board[0][4] = bKing;
        board[7][4] = wKing;
    }
}
