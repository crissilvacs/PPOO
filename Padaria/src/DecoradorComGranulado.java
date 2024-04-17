public class DecoradorComGranulado extends DecoradorDeBolo {
    public DecoradorComGranulado(Bolo bolo) {
        super(bolo);
    }

    @Override
    public int getCusto() {
        return super.getCusto() + 2;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com granulado";
    }
}
