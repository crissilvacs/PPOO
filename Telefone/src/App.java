public class App {
    public static void main(String[] args) {
        final int NUM_DIGITOS = 12;

        ModeloTelefone modelo = new ModeloTelefone();
        Tela tela = new Tela();
        
        Observador observadorDigito = new ObservadorDigito(modelo, tela);
        Observador observadorDiscagem = new ObservadorDiscagem(modelo, tela);
        
        modelo.adicionarObservador(observadorDigito);
        modelo.adicionarObservador(observadorDiscagem);

        Teclado teclado = new Teclado(modelo);
        teclado.simularPressionamentosDeTecla(NUM_DIGITOS);
    }
}
