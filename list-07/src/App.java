import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<Task>();
        int option;

        do {
            System.out.println("\nMENU DE TAREFAS");
            System.out.println("1 - Adicionar uma tarefa");
            System.out.println("2 - Remover uma tarefa");
            System.out.println("3 - Listar todas as tarefas");
            System.out.println("4 - Sair do programa");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o código da tarefa: ");
                    int code = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o título da tarefa: ");
                    String title = scanner.nextLine();

                    Task task = new Task(code, title);
                    tasks.add(task);

                    System.out.println("Tarefa adicionada com sucesso.");
                    break;

                case 2:
                    System.out.print("Digite o código da tarefa que deseja remover: ");
                    int codeToRemove = scanner.nextInt();
                    scanner.nextLine();

                    boolean removed = false;

                    for (int i = 0; i < tasks.size(); i++) {
                        if (tasks.get(i).getCode() == codeToRemove) {
                            tasks.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Tarefa removida com sucesso.");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("\nLISTA DE TAREFAS");

                        for (Task currentTask : tasks) {
                            System.out.println("Código: " + currentTask.getCode());
                            System.out.println("Título: " + currentTask.getTitle());
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (option != 4);

        scanner.close();
    }
}
