public abstract class Pagamento {
    private double valorBruto;
    private String codigoTransacao;

    public Pagamento(double valorBruto, String codigoTransacao) {
        setValorBruto(valorBruto);
        setCodigoTransacao(codigoTransacao);
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public String getCodigoTransacao() {
        return codigoTransacao;
    }

    public void setCodigoTransacao(String codigoTransacao) {
        this.codigoTransacao = codigoTransacao;
    }

    public double calcularValorFinal() {
        // A regra da taxa fica por conta do tipo concreto de pagamento.
        return valorBruto + calcularTaxa();
    }

    public abstract double calcularTaxa();

    public abstract String processarPagamento();
}