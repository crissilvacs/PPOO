public class parteCarro implements Componente {
    private String nome;
    private double peso;

    public parteCarro(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void adicionarComponente(Componente componente) {
        throw new UnsupportedOperationException("Não é possível adicionar componentes.");
    }

    @Override
    public void removerComponente(Componente componente) {
        throw new UnsupportedOperationException("Não é possível remover componentes.");
    }
}
