
public class App {
    public static void main(String[] args) throws Exception {
    
        Product product1 = new Product(01, "iPhone");

        product1.setPrice(7998);
        product1.setName("Samsung");
        System.out.println("Código do Produto: " + product1.getId());
        System.out.println("Nome do Produto: " + product1.getName());
        System.out.println("Preço do Produto: " + product1.getPrice());

        // parte do exercícío 02
        System.out.println("\n\nEXERCÍCIO 02");

        event data1 = new event(52, 044, 24);
        System.out.println("Dia: " + data1.getDay());
        System.out.println("Mês: " + data1.getMonth());
        System.out.println("Ano: " + data1.getYear());

    }
}
