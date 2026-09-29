public class Checkout {
    private CheckoutFactory factory;

    public Checkout(CheckoutFactory factory) {
        this.factory = factory;
    }

    public void finalizarPedido() {
        
        DocumentoFiscal doc = factory.criarDocumentoFiscal();
        Pagamento pag = factory.criarPagamento();
        EtiquetaEnvio etiqueta = factory.criarEtiquetaEnvio();

        System.out.println("----- RELATÓRIO DE CHECKOUT -----");
        System.out.println("Documento Fiscal: " + doc.getDescricao());
        System.out.println("Pagamento: " + pag.getDescricao());
        System.out.println("Etiqueta: " + etiqueta.getDescricao());
        System.out.println("---------------------------------\n");
    }
}
