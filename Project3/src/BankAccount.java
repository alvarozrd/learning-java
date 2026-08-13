public class BankAccount {

    // declaração de atributos/variáveis de instância
    int id;
    String clientName;
    double balance;
    
    // adicionando o comportamente = métodos
    public void deposit(double amount){
        balance += amount; 
    }

    public void withdraw (double amount){
        if(balance >= amount)
            balance -= amount;            
    }
    public void displayDerails(){
        System.out.println("Dados da conta:");
        System.out.println("Código: " + id);
        System.out.println("Nome do Cliente: " + clientName);
        System.out.println("Saldo: R$ " + balance);
    }
    

}
