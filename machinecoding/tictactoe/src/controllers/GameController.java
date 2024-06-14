package machinecoding.tictactoe.src.controllers;

import machinecoding.tictactoe.src.models.Board;
import machinecoding.tictactoe.src.models.Game;
import machinecoding.tictactoe.src.models.Player;
import machinecoding.tictactoe.src.models.PlayerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

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

}
