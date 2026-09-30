public class ApolicePessoal implements Apolice {
    private double valorVeiculo;

    public ApolicePessoal(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    public String getLinhaProduto() {
        return "Pessoal";
    }

    @Override
    public double calcularPremioMensal() {
        return (this.valorVeiculo * 0.35) / 12.0;
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade e Comprovante de renda";
    }
}
