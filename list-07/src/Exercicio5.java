import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private int codigo;
    private String nome;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome) {
        setCodigo(codigo);
        setNome(nome);
        setQuantidadeEstoque(0);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        int option;

        do {
            System.out.println("\nMENU DE PRODUTOS");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Consultar produto por código");
            System.out.println("3 - Atualizar quantidade em estoque");
            System.out.println("4 - Listar produtos com estoque baixo");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1: {
                    System.out.print("Informe o código do produto: ");
                    int codigo = Integer.parseInt(scanner.nextLine());
                    boolean codigoExiste = false;

                    for (Produto produto : produtos) {
                        if (produto.getCodigo() == codigo) {
                            codigoExiste = true;
                            break;
                        }
                    }

                    if (codigoExiste) {
                        System.out.println("Já existe um produto com esse código.");
                    } else {
                        System.out.print("Informe o nome do produto: ");
                        String nome = scanner.nextLine();

                        Produto produto = new Produto(codigo, nome);
                        produtos.add(produto);

                        System.out.println("Produto adicionado com sucesso.");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Informe o código do produto: ");
                    int codigo = Integer.parseInt(scanner.nextLine());
                    boolean encontrado = false;

                    for (Produto produto : produtos) {
                        if (produto.getCodigo() == codigo) {
                            System.out.println("Nome: " + produto.getNome());
                            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Informe o código do produto: ");
                    int codigo = Integer.parseInt(scanner.nextLine());
                    boolean encontrado = false;

                    for (Produto produto : produtos) {
                        if (produto.getCodigo() == codigo) {
                            System.out.print("Informe a nova quantidade em estoque: ");
                            int quantidade = Integer.parseInt(scanner.nextLine());

                            produto.setQuantidadeEstoque(quantidade);
                            encontrado = true;
                            System.out.println("Quantidade atualizada com sucesso.");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                }
                case 4: {
                    boolean encontrouEstoqueBaixo = false;

                    System.out.println("\nPRODUTOS COM ESTOQUE BAIXO");

                    for (Produto produto : produtos) {
                        if (produto.getQuantidadeEstoque() < 5) {
                            System.out.println("Código: " + produto.getCodigo());
                            System.out.println("Nome: " + produto.getNome());
                            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
                            System.out.println("----------------------");
                            encontrouEstoqueBaixo = true;
                        }
                    }

                    if (!encontrouEstoqueBaixo) {
                        System.out.println("Nenhum produto com estoque baixo.");
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
