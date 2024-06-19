package machinecoding.tictactoe.src.strategies;

import machinecoding.tictactoe.src.models.*;

public class ColumnWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWin(Board board, Move move) {
        int columnToCheck = move.getCell().getCol();
        Player player = move.getCell().getPlayer();

        for (int i = 0; i < board.getCells().size(); i++) {
            Cell cell = board.getCells().get(i).get(columnToCheck);
            if (cell.getCellState().equals(CellState.FREE)
                    || !cell.getPlayer().equals(player)) {
                return false;
            }
        }
        return true;
    }
}
