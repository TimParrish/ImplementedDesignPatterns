public class Mushrooms extends ToppingDecorator {
    Pizza pizza;//holds the data for the pizza were building

    public Mushrooms(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){//add Mushrooms to description
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double price() {
        return pizza.price()+0.50;//add the up-charge for pizzas price
    }
}
