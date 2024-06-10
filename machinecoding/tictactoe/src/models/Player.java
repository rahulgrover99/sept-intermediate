package machinecoding.tictactoe.src.models;

import lombok.Data;

@Data
public class Player {
    private String name;
    private Character symbol;
    private int id;
    private PlayerType playerType;
}
