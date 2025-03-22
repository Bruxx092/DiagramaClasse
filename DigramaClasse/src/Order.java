import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderID;
    private Date date;
    private List<Shirt> shirts;
    private double totalPrice;
    private Payment payment;
    private CSR csr;
    private String status;

    // Construtor
    public Order(int orderID, Date date, Payment payment, CSR csr) {
        this.orderID = orderID;
        this.date = date;
        this.shirts = new ArrayList<>();
        this.payment = payment;
        this.csr = csr;
        this.status = "Em aberto"; // Status inicial
    }

    // Métodos getters e setters
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Shirt> getShirts() {
        return shirts;
    }

    public void setShirts(List<Shirt> shirts) {
        this.shirts = shirts;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public CSR getCsr() {
        return csr;
    }

    public void setCsr(CSR csr) {
        this.csr = csr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Métodos específicos
    public int calculateOrderID() {
        // Lógica para calcular o ID do pedido
        return 0; // Substitua pelo valor correto
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Shirt shirt : shirts) {
            total += shirt.getPrice();
        }
        return total;
    }

    public void addShirtToOrder(Shirt shirt) {
        shirts.add(shirt);
    }

    public void removeShirtFromOrder(Shirt shirt) {
        shirts.remove(shirt);
    }

    public void submitOrder() {
        status = "Enviado";
    }
}