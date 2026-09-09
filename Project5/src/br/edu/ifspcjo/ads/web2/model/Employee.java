package br.edu.ifspcjo.ads.web2.model;
// pacote especificado é uma forma de organização muito utilizada 

public class Employee {
    protected String name;
    protected String cpf;

    public Employee(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", cpf=" + cpf + "]";
    }

    public double calulateIncome(){
        return 0;
    }
    // depois iremos sobrescrever este método nas outras classes para que possua o valor correto.

}
