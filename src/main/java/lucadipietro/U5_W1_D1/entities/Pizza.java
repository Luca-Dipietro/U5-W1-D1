package lucadipietro.U5_W1_D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucadipietro.U5_W1_D1.enums.PizzaType;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pizza {
    private String name;
    private int calories;
    private double price;
    private List<Topping> toppings;
    private PizzaType size;
}
