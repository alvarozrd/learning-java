public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;
    private int diasParaVencimento;

    public PagamentoBoleto(double valorBruto, String codigoTransacao, String codigoBarras, int diasParaVencimento) {
        super(valorBruto, codigoTransacao);
        setCodigoBarras(codigoBarras);
        setDiasParaVencimento(diasParaVencimento);
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getDiasParaVencimento() {
        return diasParaVencimento;
    }

    public void setDiasParaVencimento(int diasParaVencimento) {
        this.diasParaVencimento = diasParaVencimento;
    }

    @Override
    public double calcularTaxa() {
        // A emissao do boleto tem o mesmo custo, independentemente do valor.
        return 2.50;
    }

    @Override
    public String processarPagamento() {
        return "Boleto gerado com código " + codigoBarras + ". Vencimento em " + diasParaVencimento + " dias.";
    }
}