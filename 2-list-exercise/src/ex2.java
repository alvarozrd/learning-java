import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) throws Exception {
        
        int kilos, gramas, dias;
        //System.out.println("Informe o tamanho do pacote em kilos:"); 
        kilos = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do pacote em kilos: "));
        gramas = Integer.parseInt(JOptionPane.showInputDialog("Quantas gramas cada gato come?"));

        dias = (kilos * 1000 )/(gramas * 2);
        if (dias <= 0){
            JOptionPane.showMessageDialog(null, "Seus gatos estão com fome, compre ração!");
        }else{
            JOptionPane.showMessageDialog(null, "Seus gatos tem alimentos por " + dias + " dias!");
        }

    }
}
