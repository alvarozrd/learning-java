package exame;

import javax.swing.JOptionPane;
public class Arq {

    public static void main(String[] args) throws Exception {

        int age;
        
        age = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

        if (age >= 18){
            JOptionPane.showMessageDialog(null, "É maior de idade");
        }else{
            JOptionPane.showMessageDialog(null, "Não pode acessar o sistema.");

        }
        
    }
}

