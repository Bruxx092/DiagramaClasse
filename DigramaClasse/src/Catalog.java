import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Shirt> shirts;

    // Construtor
    public Catalog() {
        this.shirts = new ArrayList<>();
    }

    // Métodos getters e setters
    public List<Shirt> getShirts() {
        return shirts;
    }

    public void setShirts(List<Shirt> shirts) {
        this.shirts = shirts;
    }

    // Métodos específicos
    public void addShirt(Shirt shirt) {
        shirts.add(shirt);
    }
}