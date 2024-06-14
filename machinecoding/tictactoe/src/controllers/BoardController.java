package machinecoding.tictactoe.src.controllers;

import machinecoding.tictactoe.src.models.Board;
import machinecoding.tictactoe.src.models.Cell;
import machinecoding.tictactoe.src.models.CellState;
import machinecoding.tictactoe.src.models.Move;

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

        // Change the board state.
        Cell cell = board.getCells().get(row).get(col);
        cell.setCellState(CellState.OCCUPIED);
        cell.setPlayer(proposedMove.getCell().getPlayer());

    }

}
