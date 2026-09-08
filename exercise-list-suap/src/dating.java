import javax.swing.JOptionPane;

public class dating {

        public static void executar() {
            int day = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia:"));
            int month = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês:"));
            int year = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));

            event data2 = new event(day, month, year);

            JOptionPane.showMessageDialog(null, 
                "Dia: " + data2.getDay() + 
                "\nMês: " + data2.getMonth() + 
                "\nAno: " + data2.getYear()
            );
        }

}
