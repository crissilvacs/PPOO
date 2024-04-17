import java.util.List;

public class ObservadorDiscagem implements Observador {
    private ModeloTelefone modelo;
    private Impressora impressora;

    public ObservadorDiscagem(ModeloTelefone modelo, Impressora impressora) {
        this.modelo = modelo;
        this.impressora = impressora;
    }

    @Override
    public void atualizar() {
        List<Integer> digitos = modelo.getDigitos();
        StringBuilder sb = new StringBuilder("Agora discando ");
        for (int digito : digitos) {
            sb.append(digito);
        }
        sb.append("...");
        impressora.imprimir(sb.toString());
    }
}
