import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
    
    public static void main(String[] args) {

        int option;
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("\nMENU DE TAREFAS\n1 - Cadastrar Aluno\n2 - Remover uma tarefa\n3 - Listar todas as tarefas\n4 - Sair do programa\nEscolha uma opção: "));

            switch (option){
                case 1: {

                } 
            }
        }
        while (option != 4);

    }
}
