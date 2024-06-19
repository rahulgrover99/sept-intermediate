package machinecoding.tictactoe.src.controllers;

import machinecoding.tictactoe.src.models.*;

public class BoardController {


    public void applyMove(Move proposedMove, Board board) {
        // 1. Update the cell if a valid move

        int row = proposedMove.getCell().getRow();
        int col = proposedMove.getCell().getCol();

        if (!(row >= 0 && col >= 0 && row < board.getCells().size() && col < board.getCells().size())) {
            throw new IllegalArgumentException("Outside of bounds");
        }

        if (!board.getCells().get(row).get(col).getCellState().equals(CellState.FREE)) {
            throw new IllegalArgumentException("Cell already occupied.");
        }

        Player player = proposedMove.getCell().getPlayer();
        // Change the board state.
        Cell cell = board.getCells().get(row).get(col);
        cell.setCellState(CellState.OCCUPIED);
        cell.setPlayer(player);

        int countRows = board.getRowsMapping().get(row).getOrDefault(player, 0) + 1;
        board.getRowsMapping().get(row).put(player, countRows);

        int countCols = board.getColsMapping().get(col).getOrDefault(player, 0) + 1;
        board.getColsMapping().get(col).put(player, countCols);

    }

}
