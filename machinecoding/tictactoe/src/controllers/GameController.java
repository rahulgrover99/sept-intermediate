package machinecoding.tictactoe.src.controllers;

import builder.StudentBuilder;
import machinecoding.tictactoe.src.models.*;
import machinecoding.tictactoe.src.strategies.WinningStrategy;
import polymorphism.P;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    private final BoardController boardController;

    public GameController(BoardController boardController) {
        this.boardController = boardController;
    }

    public Game startGame() {
        System.out.println("Game is starting...");

        System.out.println("What size of the board you want to play on?");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println("What are the number of players (including bot - if any)?");
        int players = sc.nextInt();

        List<Player> playerList = new ArrayList<>();
        for (int i = 0; i < players; i++) {
            System.out.println("Name? ");
            String name = sc.next();
            System.out.println("Symbol? ");
            Character symbol = sc.next().charAt(0);
            System.out.println("Is the player a bot? (Y/N)");
            Character choice = sc.next().charAt(0);
            PlayerType playerType = choice == 'Y' ? PlayerType.BOT : PlayerType.HUMAN;
            playerList.add(new Player(name, symbol, i, playerType));
        }

        return Game.getBuilder().setDimension(N).setPlayers(playerList).build();


    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public void printBoard(Game game) {
        game.getBoard().display();
    }

    public Player getWinner(Game game) {
       return game.getWinner();
    }

    public void makeMove(Game game) {
        boolean isEmpty = checkAtleastOneEmptySpace(game.getBoard());

        if (!isEmpty) {
            game.setGameState(GameState.DRAW);
            return;
        }

        Player currentPlayer =
                game.getPlayers().get(game.getNextPlayerIndex());
        System.out.printf("It's player %s move.", currentPlayer.getName());
        // Logic for the player to make a move.

        // 1. Get the move for the player (bot/human)
        Move proposedMove = currentPlayer.makeMove();

        // 2. Placing the move on the board.
        boardController.applyMove(proposedMove, game.getBoard());

        // Check winning strategies and alter the state if changed.
        if (checkWin(game.getWinningStrategies(), game.getBoard(), proposedMove)) {
            game.setGameState(GameState.WIN);
            game.setWinner(currentPlayer);
        }

        game.setNextPlayerIndex((game.getNextPlayerIndex() + 1) % game.getPlayers().size());
    }

    private boolean checkAtleastOneEmptySpace(Board board) {
        int rows = board.getCells().size();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (board.getCells().get(i).get(j).getCellState().equals(CellState.FREE)) {
                    return true;
                }

            }
        }

        return false;


    }

    private static boolean checkWin(List<WinningStrategy> winningStrategies, Board board, Move move) {
        for (WinningStrategy ws : winningStrategies) {
            if (ws.checkWin(board, move)) {
                return true;
            }
        }
        return false;
    }
}
