package lucadipietro.U5_W1_D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Menu {
    private List<Pizza> pizze;
    private List<Topping> toppings;
    private List<Drink> drinks;
}
