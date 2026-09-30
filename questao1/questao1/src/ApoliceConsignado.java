public class ApoliceConsignado implements Apolice {
    private double valorImovel;

    public ApoliceConsignado(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    @Override
    public String getLinhaProduto() {
        return "Consignado";
    }

    @Override
    public double calcularPremioMensal() {
        return (this.valorImovel * 0.18) / 12.0;
    }

    @Override
    public String getDocumentosExigidos() {
        return "contracheque ou extrato de benefício";
    }
}
