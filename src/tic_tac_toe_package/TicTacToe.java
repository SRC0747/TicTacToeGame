package tic_tac_toe_package;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-tac-Toe Game.");
        createBoard();
    }

    private static void createBoard() {
        char[] board = new char [10];
        for (int index= 1; index < board.length; index++) {
            System.out.println(board[index]);
        }
    }
}