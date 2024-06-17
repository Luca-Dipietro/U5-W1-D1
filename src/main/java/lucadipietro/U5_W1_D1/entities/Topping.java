package lucadipietro.U5_W1_D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Topping {
    private String name;
    private int calories;
    private double price;
}
