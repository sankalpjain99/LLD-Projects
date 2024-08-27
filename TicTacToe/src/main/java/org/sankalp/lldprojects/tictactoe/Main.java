package org.sankalp.lldprojects.tictactoe;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Player 1", Symbol.X);
        Player p2 = new Player("Player 2", Symbol.O);
        Board board = new Board(3);
        board.display();
        TicTacToeGame ticTacToeGame = new TicTacToeGame(board);
        ticTacToeGame.registerPlayer(p1);
        ticTacToeGame.registerPlayer(p2);
        System.out.println(ticTacToeGame.startGame());
    }
}