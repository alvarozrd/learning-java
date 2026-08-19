public class BankAccount {

    // declaração de atributos/variáveis de instância
    //valor padrão é 0, Java não tem lixo de memória
    //como String é uma classe, o valor dela é null.
    //para double o valor é 0.
    //quando tem-se o tipo boolean, o valor padrão é false.

    private int id;
    private String clientName;
    private double balance;
    
    //métodos construtores

    public BankAccount (int id, String clientName){
        this(id, clientName, 0);
    }
    public BankAccount(int id, String clientName, double balance){
        this.id = id;
        this.clientName = clientName;
        this.balance = balance;
    }
    public void setID (int id){
        this.id = id;
    }
    public int getID (){
        return id;
    }

    public void setClientName(String clientName){
        this.clientName = clientName;
    }
    public String getClientName(){
        return clientName;
    }

    public void setBalance(double balance){
        this.balance = balance;
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
        System.out.println("Nome do Cliente: " + clientName);
        System.out.println("Saldo: R$ " + balance);
    }
    

}
