import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ItemCarrinho {
    private String nomeProduto;
    private double precoUnitario;
    private int quantidade;

    public ItemCarrinho(String nomeProduto, double precoUnitario, int quantidade) {
        setNomeProduto(nomeProduto);
        setPrecoUnitario(precoUnitario);
        setQuantidade(quantidade);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return precoUnitario * quantidade;
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ItemCarrinho> carrinho = new ArrayList<>();
        int option;

        do {
            System.out.println("\nMENU DO CARRINHO");
            System.out.println("1 - Adicionar item ao carrinho");
            System.out.println("2 - Exibir detalhes do carrinho");
            System.out.println("3 - Exibir valor total da compra");
            System.out.println("4 - Limpar carrinho");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1: {
                    System.out.print("Informe o nome do produto: ");
                    String nomeProduto = scanner.nextLine();

                    System.out.print("Informe o preço unitário: ");
                    double precoUnitario = Double.parseDouble(scanner.nextLine());

                    System.out.print("Informe a quantidade: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());

                    ItemCarrinho item = new ItemCarrinho(nomeProduto, precoUnitario, quantidade);
                    carrinho.add(item);

                    System.out.println("Item adicionado ao carrinho.");
                    break;
                }
                case 2: {
                    if (carrinho.isEmpty()) {
                        System.out.println("O carrinho está vazio.");
                    } else {
                        System.out.println("\nDETALHES DO CARRINHO");

                        for (ItemCarrinho item : carrinho) {
                            System.out.println("Produto: " + item.getNomeProduto());
                            System.out.println("Quantidade: " + item.getQuantidade());
                            System.out.println("Preço unitário: " + item.getPrecoUnitario());
                            System.out.println("Subtotal: " + item.calcularSubtotal());
                            System.out.println("----------------------");
                        }
                    }
                    break;
                }
                case 3: {
                    double total = 0;

                    for (ItemCarrinho item : carrinho) {
                        total += item.calcularSubtotal();
                    }

                    System.out.println("Valor total da compra: " + total);
                    break;
                }
                case 4: {
                    carrinho.clear();
                    System.out.println("Carrinho limpo com sucesso.");
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
