import java.io.File;

public class App{
    public static void main(String[] args) {
        File arquivoTextoEntrada = new File("./src/Hamlet.txt");
        ModeloBuscaWeb modelo = new ModeloBuscaWeb(arquivoTextoEntrada);
        new Espiao(modelo);  
        modelo.simularBusca();
    }
}
