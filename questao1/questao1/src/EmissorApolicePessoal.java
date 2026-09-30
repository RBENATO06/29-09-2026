public class EmissorApolicePessoal extends EmissorApolice {
    private double valorVeiculo;

    public EmissorApolicePessoal(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApolicePessoal(this.valorVeiculo);
    }
}
