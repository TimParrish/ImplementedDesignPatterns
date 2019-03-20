public class SmallPizza extends Pizza{
    public SmallPizza(){
        description = "12 Inch Pizza";
    }

    @Override
    public double price() {
        return 9.99;//base cost of small pizza
    }
}


