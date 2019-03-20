public class LargePizza extends Pizza {
    public LargePizza(){
        description = "16 Inch Pizza";
    }

    @Override
    public double price() {
        return 13.99;//base price of large pizza
    }
}
