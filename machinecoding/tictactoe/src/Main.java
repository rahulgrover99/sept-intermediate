package machinecoding.tictactoe.src;

import machinecoding.tictactoe.src.controllers.GameController;
import machinecoding.tictactoe.src.models.Board;
import machinecoding.tictactoe.src.models.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        GameController gameController = new GameController();
        Game game = gameController.startGame();

        Board board = new Board(4);
        board.display();


    }
}
