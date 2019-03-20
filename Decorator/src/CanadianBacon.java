public class CanadianBacon extends ToppingDecorator {
    Pizza pizza;//holds the data for the pizza were building

    public CanadianBacon(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){//add Canadian Bacon to description
        return pizza.getDescription() + ", Canadian Bacon";
    }

    @Override
    public double price() {
        return pizza.price()+1.50;//add the up-charge for pizzas price
    }
}
