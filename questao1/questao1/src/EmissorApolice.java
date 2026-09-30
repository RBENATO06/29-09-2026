public abstract class EmissorApolice {
    
    protected abstract Apolice criarApolice();

    public void emitir(String nomeSegurado) {
        Apolice apolice = criarApolice();
        
        System.out.println("----- RESUMO DA EMISSÃO -----");
        System.out.println("Linha de Produto: " + apolice.getLinhaProduto());
        System.out.println("Segurado: " + nomeSegurado);
        System.out.printf("Prêmio Mensal: R$ %.2f\n", apolice.calcularPremioMensal());
        System.out.println("Documentos Exigidos: " + apolice.getDocumentosExigidos());
        System.out.println("-----------------------------\n");
    }
}
