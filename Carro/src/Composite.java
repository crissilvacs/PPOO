import java.util.ArrayList;
import java.util.List;

public class Composite implements Componente {
    private List<Componente> componentes = new ArrayList<>();
    private String nome;
    private double pesoBase;

    public Composite(String nome, double pesoBase) {
        this.nome = nome;
        this.pesoBase = pesoBase;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPeso() {
        double totalPeso = pesoBase;
        for (Componente componente : componentes) {
            totalPeso += componente.getPeso();
        }
        return totalPeso;
    }

    @Override
    public void adicionarComponente(Componente componente) {
        componentes.add(componente);
        System.out.println("Componente adicionado: " + componente.getNome());
        System.out.println("Peso atual do " + this.nome + ": " + this.getPeso() + " kg");
    }

    @Override
    public void removerComponente(Componente componente) {
        componentes.remove(componente);
        System.out.println("Componente removido: " + componente.getNome());
        System.out.println("Peso atual do " + this.nome + ": " + this.getPeso() + " kg");
    }
}
