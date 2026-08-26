public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client(1, "Claudia Leite", "32395347383");
        BankAccount account = new BankAccount(1, client, - 500); 
        System.out.println(account);

        //account é uma variável do tipo referência - podendo ser chamado de objeto.
        //new é o nome da classe com (), onde é chamado como default o construtor da classe.


        // account.displayDetails();
        // account.setID(1);
        // account.setClientName("Roberto Carlos");
        // account.setBalance(1000);
        // System.out.println("Código: " + account.getID());
        // System.out.println("Nome do cliente: " + account.getClientName());
        // System.out.println("Saldo: R$ %.2f\n" + account.getBalance());
        // account.deposit(1000);
        // account.displayDetails();
        // account.withdraw(500);
        // account.displayDetails();
        
        // BankAccount account2 = new BankAccount(3, "Billie Elish");
        // account2.deposit(300);
        // account2.displayDetails();
        
        // BankAccount account3 = new BankAccount(2, null);
        // account3.displayDetails();

    }
}
