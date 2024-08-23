import java.util.List;

public class Whopper extends Burger {
    String bunOption;

    public Whopper(int patty, List<String> vagetable, List<String> extras) {
        super(patty, vagetable, extras);
        this.bunOption = "Glazed";

        this.vegetables.add("Tomato");
        this.vegetables.add("Lettuce");
        this.vegetables.add("Onion");
        this.vegetables.add("Pickle");
    }


    @Override
    public Burger recipe()
    {    grillPatty();
        System.out.println("burnOption : " + this.bunOption);
        System.out.println("vegetable : " + this.vegetables);
        System.out.println("extras : " + this.extras);
        return this;
    }

    public void grillPatty(){
        this.patty = 110;

    }
}

