import java.util.Date;

public class Shirt {
    private int shirtID;
    private double price;
    private String description;
    private String size;
    private String colorCode;

    // Construtor
    public Shirt(int shirtID, double price, String description, String size, String colorCode) {
        this.shirtID = shirtID;
        this.price = price;
        this.description = description;
        this.size = size;
        this.colorCode = colorCode;
    }

    // Métodos getters e setters
    public int getShirtID() {
        return shirtID;
    }

    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    // Métodos específicos
    public int calculateShirtID() {
        // Lógica para calcular o ID da camisa
        return 0; // Substitua pelo valor correto
    }

    public void displayShirtInformation() {
        System.out.println("ID da camisa: " + shirtID);
        System.out.println("Preço: " + price);
        System.out.println("Descrição: " + description);
        System.out.println("Tamanho: " + size);
        System.out.println("Código da cor: " + colorCode);
    }
}