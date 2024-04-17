public class AmazoniaFactory extends LocalizacaoFactory {
    @Override
    public Inimigo criarInimigo() {
        return new AnimalMutante();
    }
}