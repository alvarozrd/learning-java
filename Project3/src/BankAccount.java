public class BankAccount {

    // declaração de atributos/variáveis de instância
    //valor padrão é 0, Java não tem lixo de memória
    //como String é uma classe, o valor dela é null.
    //para double o valor é 0.
    //quando tem-se o tipo boolean, o valor padrão é false.

    private int id;
    private Client client;
    private double balance;
    
    //métodos construtores

    public BankAccount (int id, Client client){
        this(id, client, 0);
    }
    public BankAccount(int id, Client client, double balance){
        this.id = id;
        this.client = client;
        setBalance(balance);
    }
    public void setID (int id){
        this.id = id;
    }
    public int getID (){
        return id;
    }

    public void setClientName(Client client){
        this.client = client;
    }
    public Client getClientName(){
        return client;
    }

    public void setBalance(double balance){
        if(balance >= 0) {
        this.balance = balance;
        }
    }
    public double getBalance(){
        return balance;
    }


    // adicionando o comportamente = métodos
    public void deposit(double amount){
        balance += amount; 
    }

    public void withdraw (double amount){   
        if(balance >= amount)
            balance -= amount;            
    }
    public void displayDetails(){
        System.out.println("Dados da conta:");
        System.out.println("Código: " + id);
        System.out.println("Nome do Cliente: " + client);
        System.out.println("Saldo: R$ " + balance);
    }

    public String toString(){
        return
            "Dados da Conta" + 
            "\nCódigo da conta: " + id + 
            "\nCliente: " + client + 
            "\nSaldo: " + balance;
    }
    

}
