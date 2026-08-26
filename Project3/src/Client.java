public class Client {

    //atributos
    private int id;
    private String name;
    private String cpf;

    // métodos construtores
    public Client(int id, String name, String cpf){
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

    // métodos acessadores
    public void setId(int id){
        this.id = id;
    }
        public int getId(){
            return this.id;
        }

    public void setName(String name){
        this.name = name;
    }
        public String getName(){
            return this.name;
        }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
        public String getCpf(){
            return this.cpf;
        }

    @Override
    public String toString(){
        return  
            "Dados do cliente" + 
            "\nCódigo: " + id + 
            "\nNome: " + name + 
            "\nCPF: " + cpf;
    }
}
