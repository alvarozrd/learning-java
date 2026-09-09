package br.edu.ifspcjo.ads.web2.model;

public class HourlyEmployee extends Employee {

    private int numberOfHouersWorked;
    private double valueOfHouresWorked;
    
    public HourlyEmployee(String name, String cpf, int numberOfHouersWorked, double valueOfHouresWorked) {
        super(name, cpf);
        this.numberOfHouersWorked = numberOfHouersWorked;
        this.valueOfHouresWorked = valueOfHouresWorked;
    }

    public int getNumberOfHouersWorked() {
        return numberOfHouersWorked;
    }

    public void setNumberOfHouersWorked(int numberOfHouersWorked) {
        this.numberOfHouersWorked = numberOfHouersWorked;
    }

    public double getValueOfHouresWorked() {
        return valueOfHouresWorked;
    }

    public void setValueOfHouresWorked(double valueOfHouresWorked) {
        this.valueOfHouresWorked = valueOfHouresWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee [numberOfHouersWorked=" + numberOfHouersWorked + ", valueOfHouresWorked="
                + valueOfHouresWorked + ", name=" + name + ", cpf=" + cpf + "]";
    }

    @Override
    public double calulateIncome() {
        return numberOfHouersWorked * valueOfHouresWorked;
    }

    
}
