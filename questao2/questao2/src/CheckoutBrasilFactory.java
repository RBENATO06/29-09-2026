public class CheckoutBrasilFactory implements CheckoutFactory {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalBrasil();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBrasil();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaEnvioBrasil();
    }
}
