package br.edu.ifspcjo.ads.web2.model;

public class ComissionedAndSalariedEmployee extends ComissionedEmployee {

    private double salary;

    public ComissionedAndSalariedEmployee(String name, String cpf, double selesValue, double comomissionPercentege,
            double salary) {
        super(name, cpf, selesValue, comomissionPercentege);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ComissionedAndSalariedEmployee [salesValue=" + salesValue + ", salary=" + salary
                + ", comomissionPercentege=" + comomissionPercentege + ", name=" + name + ", cpf=" + cpf + "]";
    }

    @Override
    public double calulateIncome() {
        return super.calulateIncome() + salary;
    }
}
