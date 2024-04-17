public class ObservadorDigito implements Observador {
    private ModeloTelefone modelo;
    private Impressora impressora;

    public ObservadorDigito(ModeloTelefone modelo, Impressora impressora) {
        this.modelo = modelo;
        this.impressora = impressora;
    }

    @Override
    public void atualizar() {
        int ultimoDigito = modelo.getUltimoDigito();
        impressora.imprimir("Pressionando: " + ultimoDigito);
    }
}
