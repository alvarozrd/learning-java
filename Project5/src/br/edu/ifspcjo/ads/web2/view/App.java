package br.edu.ifspcjo.ads.web2.view;

import javax.swing.JOptionPane;

import br.edu.ifspcjo.ads.web2.controller.EmployeesController;
import br.edu.ifspcjo.ads.web2.model.ComissionedEmployee;
import br.edu.ifspcjo.ads.web2.model.Employee;
import br.edu.ifspcjo.ads.web2.model.HourlyEmployee;
import br.edu.ifspcjo.ads.web2.model.SalariedEmployee;

public class App {

    private static EmployeesController employeesController = new EmployeesController();
    public static void main(String[] args) throws Exception {
        //Module view controller (MVC) -> camada de modelo, controle e visão.

        Employee employee1 = new SalariedEmployee("Richard", "213239449203", 1621);

        employeesController.save(employee1);
        System.out.println(employee1);
        System.out.println(employee1.calulateIncome());
        Employee employee2 = new HourlyEmployee("Jessica", "220.230.543.09", 10, 465);
        System.out.println(employee2.calulateIncome());

        //criar um menu para adicionar/cadastrar empregados: Pedir qual o tipo do empregado. Para cada tipo os parametros mudam. 

        int option;

        do{

            option = Integer.parseInt(JOptionPane.showInputDialog("\nMENU DO APP\n1 - Adicionar Funcionário\n5 - Sair"));

            switch (option) {

                case 1 : {
                    // option = 0;
                    int typeOfEmplyee;
                    typeOfEmplyee = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de funcionário?\n1 - Horista\n2 - Comissionado\n3 - Comissionado e Assalariado\n 4 - Assalariado"));

                    switch ( typeOfEmplyee ) {

                        case 1 : {
                            String name = JOptionPane.showInputDialog("Nome do funcionário:");
                            String cpf = JOptionPane.showInputDialog("CPF do funcionário:");

                            int numberOfHoursWorked = Integer.parseInt(
                                JOptionPane.showInputDialog("Quantidade de horas trabalhadas:")
                            );

                            double valueOfHoursWorked = Double.parseDouble(
                                JOptionPane.showInputDialog("Valor da hora trabalhada:")
                            );

                            Employee employee = new HourlyEmployee(
                                name,
                                cpf,
                                numberOfHoursWorked,
                                valueOfHoursWorked
                            );

                            employeesController.save(employee);

                            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso.");

                            break;
                        }

                        case 2 : {
                            String name = JOptionPane.showInputDialog("Nome do funcionário:");
                            String cpf = JOptionPane.showInputDialog("CPF do funcionário:");

                            double salesValue = Double.parseDouble(
                                JOptionPane.showInputDialog("Valor da venda:")
                            );

                            double comissionPersentege = Double.parseDouble(
                                JOptionPane.showInputDialog("Porcentagem da comissão:")
                            );

                            Employee employee = new ComissionedEmployee(
                                name,
                                cpf,
                                salesValue,
                                comissionPersentege
                            );

                            employeesController.save(employee);

                            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso.");

                            break;
                        }

                        case 3: {
                            String name = JOptionPane.showInputDialog("Nome do funcionário:");
                            String cpf = JOptionPane.showInputDialog("CPF do funcionário:");

                            double salesValue = Double.parseDouble(
                                JOptionPane.showInputDialog("Valor da venda:")
                            );

                            double comissionPersentege = Double.parseDouble(
                                JOptionPane.showInputDialog("Porcentagem da comissão:")
                            );

                            Employee employee = new ComissionedEmployee(
                                name,
                                cpf,
                                salesValue,
                                comissionPersentege
                            );

                            employeesController.save(employee);

                            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso.");

                            break;
                        }

                        default : JOptionPane.showMessageDialog(null, typeOfEmplyee + " Não é uma opção válida.");

                    }
                break;
                }
                case 2 : {

                }
                default : JOptionPane.showMessageDialog(null, option + " Não é uma opção válida.");
            
            }
        } while (option != 5);


    }
}