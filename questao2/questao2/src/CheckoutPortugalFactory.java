public class CheckoutPortugalFactory implements CheckoutFactory {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalPortugal();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPortugal();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaEnvioPortugal();
    }
}
