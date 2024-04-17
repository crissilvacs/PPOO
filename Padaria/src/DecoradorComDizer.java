public class DecoradorComDizer extends DecoradorDeBolo {
    private String dizer;

    public DecoradorComDizer(Bolo bolo, String dizer) {
        super(bolo);
        this.dizer = dizer;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com o dizer '" + dizer + "'";
    }
}
