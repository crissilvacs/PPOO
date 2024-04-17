public abstract class DecoradorDeBolo extends Bolo {
    protected Bolo bolo;

    public DecoradorDeBolo(Bolo bolo) {
        this.bolo = bolo;
    }

    @Override
    public int getCusto() {
        return bolo.getCusto();
    }

    @Override
    public String getDescricao() {
        return bolo.getDescricao();
    }
}
