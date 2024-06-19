package machinecoding.tictactoe.src.models;

import lombok.Data;
import machinecoding.tictactoe.src.strategies.ColumnWinningStrategy;
import machinecoding.tictactoe.src.strategies.RowWinningOptimisedStrategy;
import machinecoding.tictactoe.src.strategies.RowWinningStrategy;
import machinecoding.tictactoe.src.strategies.WinningStrategy;
import polymorphism.B;
import polymorphism.P;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private int nextPlayerIndex;
    private Player winner;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    private Game(Builder builder) {
        if (builder.dimension < 3) {
            throw new IllegalArgumentException("The dimension of board can't be less than 3");
        }

        validatePlayers(builder.players);

        this.board = new Board(builder.dimension);
        this.players = builder.players;
        this.winningStrategies = builder.winningStrategies;
        this.moves = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
    }

    private static void validatePlayers(List<Player> players) {
        Set<Character> characterSet = new HashSet<>();
        int bots = 0;
        for (Player player: players) {
            characterSet.add(player.getSymbol());
            if (player.getPlayerType().equals(PlayerType.BOT)) bots++;
        }

        if (bots > 1 || characterSet.size() != players.size()) {
            throw new IllegalArgumentException("Bots can't be more than 1 and symbols for all players should be different.");
        }
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private List<Player> players;
        private int dimension;
        private List<WinningStrategy> winningStrategies;

        private Builder() {
            this.players = new ArrayList<>();
            this.winningStrategies = List.of(new RowWinningOptimisedStrategy(), new ColumnWinningStrategy());
            this.dimension = 3;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Game build() {
            return new Game(this);
        }

    }




}
