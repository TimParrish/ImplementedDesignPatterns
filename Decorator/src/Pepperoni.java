public class Pepperoni extends ToppingDecorator {
    Pizza pizza;//holds the data for the pizza were building

    public Pepperoni(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){//add "Pepperoni" to description
        return pizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double price() {
        return pizza.price()+1.50;//add the up-charge for pizzas price
    }
}
