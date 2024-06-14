package machinecoding.tictactoe.src.models;

public class BotPlayer extends Player{
    private Level level;

    public BotPlayer(String name, Character symbol, int id, PlayerType playerType, Level level) {
        super(name, symbol, id, playerType);
        this.level = level;
    }

    @Override
    public Move makeMove() {
        // return a move based on bot strategy.
        return new Move();

    }
}
