package machinecoding.tictactoe.src;

import machinecoding.tictactoe.src.controllers.BoardController;
import machinecoding.tictactoe.src.controllers.GameController;
import machinecoding.tictactoe.src.models.Board;
import machinecoding.tictactoe.src.models.Game;
import machinecoding.tictactoe.src.models.GameState;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        GameController gameController = new GameController(new BoardController());
        Game game = gameController.startGame();

        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            // Print the board.
            // Which player turn it is.
            // Make a move.
            gameController.printBoard(game);
            gameController.makeMove(game);
        }

        if (gameController.checkState(game).equals(GameState.DRAW)) {
            System.out.println("The game ended in a draw.");
        } else {
            System.out.printf("The player %s won.", gameController.getWinner(game).getName());
        }

    }
}
