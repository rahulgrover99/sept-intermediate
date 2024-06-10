package machinecoding.tictactoe.src.strategies;

import machinecoding.tictactoe.src.models.Board;
import machinecoding.tictactoe.src.models.Move;

public interface WinningStrategy {

    boolean checkWin(Board board, Move move);
}
