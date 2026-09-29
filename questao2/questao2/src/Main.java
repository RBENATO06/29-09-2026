public class Main {
    public static void main(String[] args) {
        
        System.out.println("Processando pedido para o BRASIL:");
        CheckoutFactory factoryBrasil = new CheckoutBrasilFactory();
        Checkout checkoutBrasil = new Checkout(factoryBrasil);
        checkoutBrasil.finalizarPedido();

        System.out.println("Processando pedido para a Portugal:");
        CheckoutFactory factoryPortugal = new CheckoutPortugalFactory();
        Checkout checkoutPortugal = new Checkout(factoryPortugal);
        checkoutPortugal.finalizarPedido();
    }
}
