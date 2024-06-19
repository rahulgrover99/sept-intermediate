package machinecoding.tictactoe.src.models;

import machinecoding.tictactoe.src.strategies.BotPlayingStrategy;
import machinecoding.tictactoe.src.strategies.BotPlayingStrategyFactory;

public class BotPlayer extends Player{
    private Level level;
    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(String name, Character symbol, int id, PlayerType playerType, Level level) {
        super(name, symbol, id, playerType);
        this.level = level;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(level);
    }

    @Override
    public Move makeMove(Board board) {
        // return a move based on bot strategy.
       Move suggestedMove = botPlayingStrategy.suggestMove(board);
       suggestedMove.getCell().setPlayer(this);
       return suggestedMove;
    }
}
