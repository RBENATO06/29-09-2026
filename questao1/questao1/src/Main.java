public class Main {
    public static void main(String[] args) {
    
        EmissorApolice emissorPessoal = new EmissorApolicePessoal(60000.00);
        EmissorApolice emissorConsignado = new EmissorApoliceConsignado(350000.00);
        EmissorApolice emissorImobiliario = new EmissorApoliceImobiliario(500000.00);

        emissorPessoal.emitir("Carlos Pereira");
        emissorConsignado.emitir("Ana Souza");
        emissorImobiliario.emitir("Roberto Alves");
    }
}
