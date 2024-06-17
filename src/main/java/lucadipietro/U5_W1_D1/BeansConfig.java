package lucadipietro.U5_W1_D1;

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
    public Topping Ham(){
        return new Topping("Ham",35,0.99);
    }

    @Bean
    public Topping Onions(){
        return new Topping("Onions",22,0.69);
    }

    @Bean
    public Topping Pineapple(){
        return new Topping("Pineapple",24,0.79);
    }

    @Bean
    public Topping Salami(){
        return new Topping("Salami",86,0.99);
    }

@Bean
public Pizza margherita(){
        return new Pizza("Margherita",1104,4.99, Arrays.asList(tomato(),cheese()), PizzaType.REGULAR);
}
}
