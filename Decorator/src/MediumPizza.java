public class MediumPizza extends Pizza{
    public MediumPizza(){
        description = "14 Inch Pizza";
    }

    @Override
    public double price() {
        return 11.99;//base price of medium pizza
    }
}
