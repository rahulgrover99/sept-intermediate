package machinecoding.tictactoe.src.strategies;

import machinecoding.tictactoe.src.models.Board;
import machinecoding.tictactoe.src.models.Move;

public class RowWinningOptimisedStrategy implements WinningStrategy{
    @Override
    public boolean checkWin(Board board, Move move) {

        int row = move.getCell().getRow();
        return board.getRowsMapping()
                .get(row).get(move.getCell().getPlayer())
                == board.getCells().size();
    }
}
