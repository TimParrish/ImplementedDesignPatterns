public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Tim's Pizza shop! Here are a few of our prices:\n");
        //first pizza (large)
        Pizza firstPizza = new LargePizza();
        System.out.println("The base price of a large pizza without toppings:");
        System.out.println("\t" + firstPizza.getDescription() + " $" + firstPizza.price());

        //second pizza (medium)
        Pizza secondPizza = new MediumPizza();
        System.out.println("The base price of a medium pizza without toppings:");
        System.out.println("\t" + secondPizza.getDescription() + " $" + secondPizza.price());

        //third pizza (small)
        Pizza thirdPizza = new SmallPizza();
        System.out.println("The base price of a small pizza without toppings:");
        System.out.println("\t" + thirdPizza.getDescription() + " $" + thirdPizza.price());

        System.out.println("\nYour order:");
        //add some extra toppings to the first pizza (decorate it!)
        firstPizza = new ExtraCheese(firstPizza);
        firstPizza = new ExtraCheese(firstPizza);//double down on the extra cheese
        firstPizza = new Pepperoni(firstPizza);
        firstPizza = new Sausage(firstPizza);
        firstPizza = new Mushrooms(firstPizza);
        firstPizza = new Olives(firstPizza);
        firstPizza = new ItalianHerbBlend(firstPizza);
        System.out.print("\t" + firstPizza.getDescription());
        System.out.format(". Total Price $%.2f%n", firstPizza.price());
    }
}

