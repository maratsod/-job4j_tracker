package inheritance;

public class PizzaExtraCheeseExtraTomato extends Pizza {
    @Override
    public String name() {
        return super.name() + " + extra cheese + extra tomato";
    }
}
