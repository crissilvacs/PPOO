public class RioDeJaneiroFactory extends LocalizacaoFactory {
    @Override
    public Inimigo criarInimigo() {
        return new Criminoso();
    }
}