import java.util.List;

public class Burger {

    int patty;
    List<String> vegetables;
    List<String> extras;

    public Burger(int patty, List<String> vegetables, List<String> extras) {
        this.patty = patty;
        this.vegetables = vegetables;
        this.extras = extras;
    }

    public Burger() {

    }

    public Burger recipe(){
        return this;
    }

    public int getPatty() {
        return patty;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public List<String> getExtras() {
        return extras;
    }
}
