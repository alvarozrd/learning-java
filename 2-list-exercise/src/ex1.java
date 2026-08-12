import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args) throws Exception {
        int idade;
        System.out.println("Informe sua idade");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua Idade:")); 
        if (idade >= 18){
            JOptionPane.showMessageDialog(null, "Você acessou o sistema");
        }else{
            JOptionPane.showMessageDialog(null, "Você é menor de idade");            
        }

    }
}
