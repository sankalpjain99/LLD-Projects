package org.sankalp.lldprojects.tictactoe;

import java.util.Objects;

public class Board {

    private final int dimension;
    private final Symbol[][] board;

    public Board(int dimension) {
        this.dimension = dimension;
        this.board = new Symbol[dimension][dimension];
    }

    public boolean hasEmptySpaces() {
        // TODO - implment
    }

    public boolean markMove(int row, int col, Symbol symbol) {
        if(Objects.nonNull(board[row][col])) {
            return false;
        }
        board[row][col] = symbol;
        return true;
    }

    public void display() {
        System.out.println("-------");
        for(int i=0;i<dimension;i++) {
            System.out.print("|");
            for(int j=0;j<dimension;j++) {
                System.out.print((board[i][j] == null ? " " : board[i][j]) + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }

}
