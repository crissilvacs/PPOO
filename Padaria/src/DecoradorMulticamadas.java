public class DecoradorMulticamadas extends DecoradorDeBolo {
    public DecoradorMulticamadas(Bolo bolo) {
        super(bolo);
    }

    @Override
    public int getCusto() {
        return super.getCusto() + 5;
    }

    @Override
    public String getDescricao() {
        return "Multicamadas " + super.getDescricao();
    }
}
