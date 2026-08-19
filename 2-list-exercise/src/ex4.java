import javax.swing.JOptionPane;

public class ex4 {
    public static void main(){
        double pernoite_econômica = 286.98, pernoite_presidencial = 789.97, total_compra;
        int total_hospedes, noites_compradas, escolha_quarto;
        int resposta = JOptionPane.showConfirmDialog(null, "Você pretende se hospedar final de semana?", "Confirmação", JOptionPane.YES_NO_OPTION);

        boolean finaldesemana = (resposta == JOptionPane.YES_OPTION);

        noites_compradas = Integer.parseInt(JOptionPane.showInputDialog("Quantas noites pretende alugar? \n <Informe em caractéres numéricos>"));
        do{
            escolha_quarto = Integer.parseInt(JOptionPane.showInputDialog("Escolha a modalidade de quarto: \n [1]- Suíte Padrão (R$" + pernoite_econômica + ")\n [2]- Suíte Presidencial (R$" + pernoite_presidencial + ")"));
        }
        while(escolha_quarto != 1 && escolha_quarto != 2);

        total_hospedes = Integer.parseInt(JOptionPane.showInputDialog("Quantos hóspedes serão no total?"));

        if(finaldesemana){
            JOptionPane.showMessageDialog(null, "Que bom, estamos com uma promoção para esta condição!");
            if(escolha_quarto == 1){
                total_compra = (noites_compradas * pernoite_econômica * total_hospedes) * 0.9; 
            }else{
                total_compra = (noites_compradas * pernoite_presidencial * total_hospedes) * 0.9;
            }
            JOptionPane.showMessageDialog(null, "O total de noites contratadas foi de " + noites_compradas + ", Por apenas R$" + total_compra + " com um desconto de 10%!");     
        }else{
            JOptionPane.showMessageDialog(null,"Excelente escolha!");
            if(escolha_quarto == 1 ){
                total_compra = (noites_compradas * pernoite_econômica * total_hospedes);
            }else{
                total_compra = (noites_compradas * pernoite_presidencial * total_hospedes);
            }
            JOptionPane.showMessageDialog(null, "O total de noites contratadas foi de " + noites_compradas + ", No valor de R$" + total_compra + ".");  
        }

    }
    
} 
