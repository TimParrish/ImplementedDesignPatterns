public class Olives extends ToppingDecorator {
    Pizza pizza;//holds the data for the pizza were building

    public Olives(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){//add olives to description
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public double price() {
        return pizza.price()+0.50;//add the up-charge for pizzas price
    }
}
