package machinecoding.tictactoe.src.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import polymorphism.C;

import java.util.Scanner;

@Data
@AllArgsConstructor
public class Player {
    private String name;
    private Character symbol;
    private int id;
    private PlayerType playerType;

    public Move makeMove(Board board) {
        // User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Row? ");
        int row = sc.nextInt();
        System.out.println("Col? ");
        int col = sc.nextInt();

        Cell cell = new Cell(row, col, this, CellState.OCCUPIED);

        return new Move(cell);
    }
}
