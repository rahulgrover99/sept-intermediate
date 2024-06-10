package machinecoding.tictactoe.src.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class Board {
    private List<List<Cell>> cells;

    private List<Map<Player, Integer>> rowsMapping;
    private List<Map<Player, Integer>> colsMapping;


    public Board(int dimension) {
        // this.cells = []
        this.cells = new ArrayList<>();


        for (int i = 0; i < dimension; i++) {
            // [
            //  [(0, 0), (0, 1), (0, 2)],
            //  []
            // ]
            this.cells.add(new ArrayList<>());
            for (int j = 0; j < dimension; j++) {
                this.cells.get(i).add(new Cell(i, j));
            }
        }
    }


    public void display() {
        for (int i = 0; i < cells.size(); i++) {
            for (int j = 0; j < cells.size(); j++) {
                if (cells.get(i).get(j).getCellState()
                        .equals(CellState.FREE)) {
                    System.out.print("|  |");
                } else {
                    System.out.printf("| %s |",
                            cells.get(i).get(j).getPlayer().getSymbol());
                }
            }
            System.out.println();
        }
    }

}
