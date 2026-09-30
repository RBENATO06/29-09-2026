public class EmissorApoliceImobiliario extends EmissorApolice {
    private double capitalSegurado;

    public EmissorApoliceImobiliario(double capitalSegurado) {
        this.capitalSegurado = capitalSegurado;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceImobiliario(this.capitalSegurado);
    }
}
