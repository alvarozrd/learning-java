import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    private String prontuario;
    private String nome;
    private double nota;

    public Aluno(String prontuario, String nome, double nota) {
        setProntuario(prontuario);
        setNome(nome);
        setNota(nota);
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> estudantes = new ArrayList<>();
        int option;

        do {
            System.out.println("\nMENU DE ALUNOS");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Exibir alunos aprovados");
            System.out.println("3 - Exibir média da turma");
            System.out.println("4 - Remover aluno por prontuário");
            System.out.println("5 - Sair do programa");
            System.out.print("Escolha uma opção: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1: {
                    System.out.print("Informe o prontuário: ");
                    String prontuario = scanner.nextLine();

                    System.out.print("Informe o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Informe a nota: ");
                    double nota = Double.parseDouble(scanner.nextLine());

                    Aluno aluno = new Aluno(prontuario, nome, nota);
                    estudantes.add(aluno);

                    System.out.println("Aluno cadastrado com sucesso.");
                    break;
                }
                case 2: {
                    boolean encontrouAprovado = false;

                    System.out.println("\nALUNOS APROVADOS");

                    for (Aluno aluno : estudantes) {
                        if (aluno.getNota() >= 6.0) {
                            System.out.println("Prontuário: " + aluno.getProntuario());
                            System.out.println("Nome: " + aluno.getNome());
                            System.out.println("Nota: " + aluno.getNota());
                            System.out.println("----------------------");
                            encontrouAprovado = true;
                        }
                    }

                    if (!encontrouAprovado) {
                        System.out.println("Nenhum aluno aprovado encontrado.");
                    }
                    break;
                }
                case 3: {
                    if (estudantes.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        double soma = 0;

                        for (Aluno aluno : estudantes) {
                            soma += aluno.getNota();
                        }

                        double media = soma / estudantes.size();
                        System.out.println("Média da turma: " + media);
                    }
                    break;
                }
                case 4: {
                    System.out.print("Informe o prontuário do aluno que deseja remover: ");
                    String prontuario = scanner.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < estudantes.size(); i++) {
                        if (estudantes.get(i).getProntuario().equals(prontuario)) {
                            estudantes.remove(i);
                            removido = true;
                            break;
                        }
                    }

                    if (removido) {
                        System.out.println("Aluno removido com sucesso.");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Programa encerrado.");
                    break;
                }
                default: {
                    System.out.println("Opção inválida.");
                    break;
                }
            }
        } while (option != 5);

        scanner.close();
    }
}
