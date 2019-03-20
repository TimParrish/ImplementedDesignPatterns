public class ItalianHerbBlend extends ToppingDecorator {
    Pizza pizza;//holds the data for the pizza were building

    public ItalianHerbBlend(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription(){//add Italian Herb Blend to description
        return pizza.getDescription() + ", Italian Herb Blend";
    }

    @Override
    public double price() {
        return pizza.price()+0.50;//add the up-charge for pizzas price
    }
}
