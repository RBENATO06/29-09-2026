public class EmissorApoliceConsignado extends EmissorApolice {
    private double valorImovel;

    public EmissorApoliceConsignado(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceConsignado(this.valorImovel);
    }
}
