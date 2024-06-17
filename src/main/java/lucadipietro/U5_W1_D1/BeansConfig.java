package lucadipietro.U5_W1_D1;

import lucadipietro.U5_W1_D1.entities.Drink;
import lucadipietro.U5_W1_D1.entities.Menu;
import lucadipietro.U5_W1_D1.entities.Pizza;
import lucadipietro.U5_W1_D1.entities.Topping;
import lucadipietro.U5_W1_D1.enums.PizzaType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeansConfig {

    @Bean
    public Topping tomato(){
        return new Topping("Tomato",18,0.49);
    }

    @Bean
    public Topping cheese(){
        return new Topping("Cheese",92,0.69);
    }

    @Bean
    public Topping ham(){
        return new Topping("Ham",35,0.99);
    }

    @Bean
    public Topping onions(){
        return new Topping("Onions",22,0.69);
    }

    @Bean
    public Topping pineapple(){
        return new Topping("Pineapple",24,0.79);
    }

    @Bean
    public Topping salami(){
        return new Topping("Salami",86,0.99);
    }

    @Bean
    public Pizza margheritaPizza(){
        return new Pizza("Pizza Margherita",1104,4.99, Arrays.asList(tomato(),cheese()), PizzaType.REGULAR);
    }

    @Bean
    public Pizza margheritaPizzaXL(){
        return new Pizza("Pizza Margherita",1504,8.99, Arrays.asList(tomato(),cheese()), PizzaType.XL);
    }

    @Bean
    public Pizza hawaiianPizza(){
        return new Pizza("Hawaiian Pizza",1024,6.49,Arrays.asList(tomato(),cheese(),pineapple(),ham()),PizzaType.REGULAR);
    }

    @Bean
    public Pizza hawaiianPizzaXL(){
        return new Pizza("Hawaiian Pizza",1504,10.49,Arrays.asList(tomato(),cheese(),pineapple(),ham()),PizzaType.XL);
    }

    @Bean
    public Pizza salamiPizza(){
        return new Pizza("Salami Pizza",1160,5.99,Arrays.asList(tomato(),cheese(),salami()),PizzaType.REGULAR);
    }

    @Bean
    public Pizza salamiPizzaXL(){
        return new Pizza("Salami Pizza",1606,9.99,Arrays.asList(tomato(),cheese(),salami()),PizzaType.XL);
    }

    @Bean
    public Drink water(){
        return new Drink("Water",0,1.29);
    }

    @Bean
    public Drink lemonade(){
        return new Drink("Lemonade",128,1.29);
    }

    @Bean
    public Drink wine(){
        return new Drink("Wine",607,7.49);
    }

    @Bean
    public Menu menu(){
        return new Menu(Arrays.asList(margheritaPizza(),margheritaPizzaXL(),hawaiianPizza(),hawaiianPizzaXL(),salamiPizza(),salamiPizzaXL()),
                Arrays.asList(tomato(),cheese(),ham(),onions(),pineapple(),salami()),
                Arrays.asList(water(),lemonade(),wine()));
    }
}
