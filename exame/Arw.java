package exame;

import javax.swing.JOptionPane;

public class Arw {
        public static void main(String[] args) throws Exception {

            String month = JOptionPane.showInputDialog("Digite um mês que é verão?");

            switch (month) {
                case "Dezembro":
                    JOptionPane.showMessageDialog(null, month);
                    break;
                case "Janeiro":
                    JOptionPane.showMessageDialog(null, month);
                    break;
                case "Fevereiro":
                    JOptionPane.showMessageDialog(null, month);
                    break;
                case "Março":
                    JOptionPane.showMessageDialog(null, month);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Mês inválido, outra estação!");
                    break;
            }
        }
        
}
