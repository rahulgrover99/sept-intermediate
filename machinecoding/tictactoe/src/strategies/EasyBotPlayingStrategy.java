package machinecoding.tictactoe.src.strategies;


import machinecoding.tictactoe.src.models.Board;
import machinecoding.tictactoe.src.models.CellState;
import machinecoding.tictactoe.src.models.Move;

/**
 * Easy bot playing strategy simply returns a move
 * to the first cell that is empty.
 */
public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move suggestMove(Board board) {
        for (int i = 0; i < board.getCells().size(); i++) {
            for (int j = 0; j < board.getCells().size(); j++) {
                if (board.getCells().get(i).get(j).getCellState().equals(CellState.FREE)) {
                    return new Move(board.getCells().get(i).get(j));
                }
            }
        }
        return null;
    }
}