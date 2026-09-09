package br.edu.ifspcjo.ads.web2.model;

public class HourlyEmployee extends Employee {

    private int numberOfHouersWorked;
    private double valueOfHouersWorked;
    
    public HourlyEmployee(String name, String cpf, int numberOfHouersWorked, double valueOfHouresWorked) {
        super(name, cpf);
        this.numberOfHouersWorked = numberOfHouersWorked;
        this.valueOfHouersWorked = valueOfHouresWorked;
    }

    public int getNumberOfHouersWorked() {
        return numberOfHouersWorked;
    }

    public void setNumberOfHouersWorked(int numberOfHouersWorked) {
        this.numberOfHouersWorked = numberOfHouersWorked;
    }

    public double getValueOfHouersWorked() {
        return valueOfHouersWorked;
    }

    public void setValueOfHouersWorked(double valueOfHouresWorked) {
        this.valueOfHouersWorked = valueOfHouresWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee [numberOfHouersWorked=" + numberOfHouersWorked + ", valueOfHouresWorked="
                + valueOfHouersWorked + ", name=" + name + ", cpf=" + cpf + "]";
    }

    @Override
    public double calulateIncome() {
        return numberOfHouersWorked * valueOfHouersWorked;
    }

    
}
