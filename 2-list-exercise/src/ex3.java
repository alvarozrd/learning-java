import javax.swing.JOptionPane;
import java.lang.Math;

public class ex3 {
    public void main(String[] args) throws Exception{
        double coast, invite;
        int balance;
        coast = Double.parseDouble(JOptionPane.showInputDialog("Qual valor para realização do espetáculo?"));
        invite = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do ingresso para o evento?"));

        balance = (int) Math.ceil(coast / invite);
        
        JOptionPane.showMessageDialog(null, "Para que o evento possa acontecer, precisarão ser verndidos no minímo " + balance +" ingressos.");

    }

    
}
