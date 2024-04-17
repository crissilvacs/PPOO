public class BoloDeMorango extends Bolo {
    @Override
    public int getCusto() {
        return super.getCusto() * 2;
    }

    @Override
    public String getDescricao() {
        return "Bolo de morango";
    }
}

