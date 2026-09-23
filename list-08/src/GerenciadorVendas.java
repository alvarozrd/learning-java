import java.util.ArrayList;

public class GerenciadorVendas {
    public static void main(String[] args) {
        ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

        pagamentos.add(new PagamentoPix(100.00, "PIX-001", "cliente@email.com"));
        pagamentos.add(new PagamentoCartao(250.00, "CARD-001", "1234 5678 9012 3456", 3));
        pagamentos.add(new PagamentoBoleto(80.00, "BOL-001", "00190.00009 01234.567890 12345.678901 1", 10));

        for (Pagamento pagamento : pagamentos) {
            System.out.println(pagamento.processarPagamento());
            System.out.printf("Valor bruto: R$ %.2f%n", pagamento.getValorBruto());
            System.out.printf("Taxa: R$ %.2f%n", pagamento.calcularTaxa());
            System.out.printf("Valor final: R$ %.2f%n%n", pagamento.calcularValorFinal());
        }
    }
}