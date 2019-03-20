public class Sausage extends ToppingDecorator {
    Pizza pizza;//holds the data for the pizza were building

    public Sausage(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){//add Sausage to description
        return pizza.getDescription() + ", Sausage";
    }

    @Override
    public double price() {
        return pizza.price()+1.50;//add the up-charge for pizzas price
    }
}
