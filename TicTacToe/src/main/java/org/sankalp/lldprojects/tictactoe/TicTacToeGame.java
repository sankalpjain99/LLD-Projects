package org.sankalp.lldprojects.tictactoe;

import lombok.RequiredArgsConstructor;

import java.util.Deque;
import java.util.Scanner;

@RequiredArgsConstructor
public class TicTacToeGame {

    private final Board board;
    private Deque<Player> playerQueue;

    public void registerPlayer(Player player) {
        playerQueue.add(player);
    }

    public String startGame() {
        while(board.hasEmptySpaces()) {
            Player currentPlayer = playerQueue.peek();
            board.display();
            System.out.println(currentPlayer.getName() + "'s Turn. Please enter coordinates: ");
            String input;
            try(Scanner scanner = new Scanner(System.in)) {
                input = scanner.nextLine();
            };
            int row = Integer.parseInt(input.split(",")[0]);
            int col = Integer.parseInt(input.split(",")[1]);
            boolean moveSuccess = board.markMove(row, col, currentPlayer.getSymbol());
            if(!moveSuccess) {
                System.out.println("Incorrect move, pls try again");
                continue;
            }
            playerQueue.removeFirst();
            playerQueue.add(currentPlayer);
            if(isWinningMove(row, col, currentPlayer.getSymbol())) {
                return currentPlayer.getName();
            }
        }
        return "No Winners";
    }

    public boolean isWinningMove(int row, int col, Symbol symbol) {
        // TODO - implement
    }

}
