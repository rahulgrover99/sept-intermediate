package machinecoding.tictactoe.src.strategies;

import machinecoding.tictactoe.src.models.Board;
import machinecoding.tictactoe.src.models.Move;

public interface BotPlayingStrategy {
    Move suggestMove(Board board);
}
