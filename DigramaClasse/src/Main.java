import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt(1, 29.99, "Camiseta Básica", "M", "Azul");
        Shirt shirt2 = new Shirt(2, 34.99, "Camiseta Estampada", "G", "Vermelha");

        Payment payment = new Payment("12345", "5432109876543210", new Date());

        CSR csr = new CSR("Ana Silva", "123");

        Order order = new Order(1001, new Date(), payment, csr);

        order.addShirtToOrder(shirt1);
        order.addShirtToOrder(shirt2);

        double totalPrice = order.calculateTotalPrice();
        order.setTotalPrice(totalPrice);

        Customer customer = new Customer(101, "João Pereira", "Rua das Flores, 123", "99999-9999", "joao@email.com");

        customer.getOrders().add(order);

        Catalog catalog = new Catalog();

        catalog.addShirt(shirt1);
        catalog.addShirt(shirt2);

        System.out.println("Pedido ID: " + order.getOrderID());
        System.out.println("Data do Pedido: " + order.getDate());
        System.out.println("Total do Pedido: R$" + order.getTotalPrice());
        System.out.println("Cliente: " + customer.getName());
        System.out.println("CSR: " + csr.getName());

        System.out.println("\nCamisas no Pedido:");
        for (Shirt shirt : order.getShirts()) {
            shirt.displayShirtInformation();
        }

        System.out.println("\nCamisas no Catálogo:");
        for (Shirt shirt : catalog.getShirts()) {
            shirt.displayShirtInformation();
        }
    }
}
