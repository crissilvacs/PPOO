import java.util.ArrayList;
import java.util.List;

public class ModeloTelefone {
    private List<Integer> digitos = new ArrayList<>();
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void adicionarDigito(int novoDigito) {
        digitos.add(novoDigito);
        notificarObservadores();
    }

    public List<Integer> getDigitos() {
        return new ArrayList<>(digitos);
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar();
        }
    }

    public int getUltimoDigito() {
        return digitos.isEmpty() ? -1 : digitos.get(digitos.size() - 1);
    }
}
