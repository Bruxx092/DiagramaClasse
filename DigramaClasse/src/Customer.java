import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    private List<Order> orders;

    // Construtor
    public Customer(int customerID, String name, String address, String phoneNumber, String emailAddress) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.orders = new ArrayList<>();
    }

    // Métodos getters e setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    // Métodos específicos
    public int assignCustomerID() {
        // Lógica para atribuir o ID do cliente
        return 0; // Substitua pelo valor correto
    }
}