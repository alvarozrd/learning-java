import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Aluno {
    
    public static void main(String[] args) {

        int option;
        List<Classmate> estudantes = new ArrayList<>();



        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("\nMENU DE TAREFAS\n1 - Cadastrar Aluno\n2 - Alunos aprovados\n3 - Listar todas as tarefas\n4 - Sair do programa\nEscolha uma opção: "));

            switch (option){
                case 1: {
                    String prontuario = JOptionPane.showInputDialog("Informe o prontuário: ");
                    String nome = JOptionPane.showInputDialog("Informe o nome: ");
                    double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota: "));

                    Classmate aluno = new Classmate(prontuario, nome, nota);
                    estudantes.add(aluno);
                    break;
                } 
                case 2: {

                }
            }
        }
        while (option != 4);

    }
}
