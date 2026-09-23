public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private int qtdParcelas;

    public PagamentoCartao(double valorBruto, String codigoTransacao, String numeroCartao, int qtdParcelas) {
        super(valorBruto, codigoTransacao);
        setNumeroCartao(numeroCartao);
        setQtdParcelas(qtdParcelas);
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    @Override
    public double calcularTaxa() {
        // Diferente do boleto, a taxa do cartao acompanha o valor bruto.
        return getValorBruto() * 0.035;
    }

    @Override
    public String processarPagamento() {
        return "Pagamento em " + qtdParcelas + "x no cartão " + numeroCartao + " autorizado com sucesso!";
    }
}