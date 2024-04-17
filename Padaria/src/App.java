public class App {
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido();
        pedido.adicionarBolo(new BoloDeChocolate());
        pedido.adicionarBolo(new DecoradorComDizer(new BoloDeBaunilha(), "PLAIN!"));
        pedido.adicionarBolo(new DecoradorComDizer(new DecoradorComGranulado(new BoloDeBaunilha()), "FANCY"));
        pedido.adicionarBolo(new DecoradorComDizer(
            new DecoradorComDizer(
                new DecoradorComGranulado(
                    new DecoradorComGranulado(
                        new DecoradorMulticamadas(new BoloDeMorango()))), "One of"), "EVERYTHING"));

       
        pedido.imprimirPedido();
    }
}
