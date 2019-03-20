public class Pineapple extends ToppingDecorator {
    Pizza pizza;//holds the data for the pizza were building

    public Pineapple(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){//add Pineapple to description
        return pizza.getDescription() + ", Pineapple";
    }

    @Override
    public double price() {
        return pizza.price()+0.50;//add the up-charge for pizzas price
    }
}
