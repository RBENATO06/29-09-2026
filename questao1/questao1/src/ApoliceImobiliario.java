public class ApoliceImobiliario implements Apolice {
    private double capitalSegurado;

    public ApoliceImobiliario(double capitalSegurado) {
        this.capitalSegurado = capitalSegurado;
    }

    @Override
    public String getLinhaProduto() {
        return "Imobiliario";
    }

    @Override
    public double calcularPremioMensal() {
        return (this.capitalSegurado * 0.03) / 12.0;
    }

    @Override
    public String getDocumentosExigidos() {
        return "Matrícula do imóvel e comprovante de renda";
    }
}
