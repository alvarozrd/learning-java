public class App {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount(); 
        //account é uma variável do tipo referência - podendo ser chamado de objeto.
        //new é o nome da classe com (), onde é chamado como default o construtor da classe.

        account.deposit(1000);
        account.displayDetails();
        account.withdraw(500);
        account.displayDetails();
        
        BankAccount account2 = new BankAccount();
        account2.deposit(300);
        account2.displayDetails();
    }
}
