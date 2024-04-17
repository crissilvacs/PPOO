import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ModeloBuscaWeb {
    private final File arquivoFonte;
    private final List<EntradaObservador> entradasObservador = new ArrayList<>();

    public interface ObservadorConsulta {
        void aoReceberConsulta(String consulta);
    }

    private static class EntradaObservador {
        final ObservadorConsulta observador;
        final FiltroConsulta filtro;

        EntradaObservador(ObservadorConsulta observador, FiltroConsulta filtro) {
            this.observador = observador;
            this.filtro = filtro;
        }
    }

    public ModeloBuscaWeb(File arquivoFonte) {
        this.arquivoFonte = arquivoFonte;
    }

    public void simularBusca() {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoFonte))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                notificarObservadoresFiltrados(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void adicionarObservadorConsulta(ObservadorConsulta observador, FiltroConsulta filtro) {
        entradasObservador.add(new EntradaObservador(observador, filtro));
    }

    private void notificarObservadoresFiltrados(String consulta) {
        for (EntradaObservador entrada : entradasObservador) {
            if (entrada.filtro.filtrar(consulta)) {
                entrada.observador.aoReceberConsulta(consulta);
            }
        }
    }
}

