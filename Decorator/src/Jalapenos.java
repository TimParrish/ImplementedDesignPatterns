public class Jalapenos extends ToppingDecorator {
    Pizza pizza;//holds the data for the pizza were building

    public Jalapenos(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){//add Jalapeno to description
        return pizza.getDescription() + ", Jalapeno";
    }

    @Override
    public double price() {
        return pizza.price()+0.50;//add the up-charge for pizzas price
    }
}
