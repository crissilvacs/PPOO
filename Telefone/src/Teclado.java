import java.util.Random;

public class Teclado {
    private final ModeloTelefone modelo;

    public Teclado(ModeloTelefone modelo) {
        this.modelo = modelo;
    }

    public void simularPressionamentosDeTecla(int numPressionamentos) {
        final int MAX_DIGITO = 9;
        Random rnd = new Random();
        for (int i = 0; i < numPressionamentos; i++) {
            int novoDigito = rnd.nextInt(MAX_DIGITO + 1);
            modelo.adicionarDigito(novoDigito);
        }
    }
}
