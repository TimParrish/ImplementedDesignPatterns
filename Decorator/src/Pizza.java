public abstract class Pizza {
    String description = "custom pizza";

    public String getDescription(){
        return description;
    }

    public abstract double price();
}
