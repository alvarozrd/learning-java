public class BankAccount {

    // declaração de atributos/variáveis de instância
    int id;
    //valor padrão é 0, Java não tem lixo de memória

    String clientName;
    //como String é uma classe, o valor dela é null.

    double balance;
    //para double o valor é 0.

    //quando tem-se o tipo boolean, o valor padrão é false.
    
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
