public class ExtraCheese extends ToppingDecorator {
    Pizza pizza;//holds the data for the pizza were building

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){//add extra cheese to description
        return pizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double price() {
        return pizza.price()+2.50;//add the up-charge for pizzas price
    }
}
