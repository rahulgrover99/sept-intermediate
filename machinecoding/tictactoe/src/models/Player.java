package machinecoding.tictactoe.src.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    private String name;
    private Character symbol;
    private int id;
    private PlayerType playerType;
}
