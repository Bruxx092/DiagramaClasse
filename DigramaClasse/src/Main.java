import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando alguns objetos de Camisa
        Shirt shirt1 = new Shirt(1, 29.99, "Camiseta Básica", "M", "Azul");
        Shirt shirt2 = new Shirt(2, 34.99, "Camiseta Estampada", "G", "Vermelha");

        // Criando um objeto de Pagamento
        Payment payment = new Payment("12345", "5432109876543210", new Date());

        // Criando um objeto de CSR
        CSR csr = new CSR("Ana Silva", "123");

        // Criando um objeto de Pedido
        Order order = new Order(1001, new Date(), payment, csr);

        // Adicionando camisas ao pedido
        order.addShirtToOrder(shirt1);
        order.addShirtToOrder(shirt2);

        // Calculando o preço total do pedido
        double totalPrice = order.calculateTotalPrice();
        order.setTotalPrice(totalPrice);

        // Criando um objeto de Cliente
        Customer customer = new Customer(101, "João Pereira", "Rua das Flores, 123", "99999-9999", "joao@email.com");

        // Adicionando o pedido ao cliente
        customer.getOrders().add(order);

        // Criando um objeto de Catálogo
        Catalog catalog = new Catalog();

        // Adicionando camisas ao catálogo
        catalog.addShirt(shirt1);
        catalog.addShirt(shirt2);

        // Exibindo informações do pedido
        System.out.println("Pedido ID: " + order.getOrderID());
        System.out.println("Data do Pedido: " + order.getDate());
        System.out.println("Total do Pedido: R$" + order.getTotalPrice());
        System.out.println("Cliente: " + customer.getName());
        System.out.println("CSR: " + csr.getName());

        // Exibindo informações das camisas no pedido
        System.out.println("\nCamisas no Pedido:");
        for (Shirt shirt : order.getShirts()) {
            shirt.displayShirtInformation();
        }

        // Exibindo informações do catálogo
        System.out.println("\nCamisas no Catálogo:");
        for (Shirt shirt : catalog.getShirts()) {
            shirt.displayShirtInformation();
        }
    }
}