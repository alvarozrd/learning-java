package br.edu.ifspcjo.ads.web2.model;

public class ComissionedEmployee extends Employee {

    protected double salesValue;
    protected double comomissionPercentege;
    
    public ComissionedEmployee(String name, String cpf, double selesValue, double comomissionPercentege) {
        super(name, cpf);
        this.salesValue = selesValue;
        this.comomissionPercentege = comomissionPercentege;
    }

    public double getSelesValue() {
        return salesValue;
    }

    public void setSelesValue(double selesValue) {
        this.salesValue = selesValue;
    }

    public double getComomissionPercentege() {
        return comomissionPercentege;
    }

    public void setComomissionPercentege(double comomissionPercentege) {
        this.comomissionPercentege = comomissionPercentege;
    }

    
    @Override
    public String toString() {
        return "ComissionedEmployee [selesValue=" + salesValue + ", comomissionPercentege=" + comomissionPercentege
                + ", name=" + name + ", cpf=" + cpf + "]";
    }

    @Override
    public double calulateIncome() {
        return salesValue * comomissionPercentege / 100;
    }

    
    
}
