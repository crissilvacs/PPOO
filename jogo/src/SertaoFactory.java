public class SertaoFactory extends LocalizacaoFactory {
    @Override
    public Inimigo criarInimigo() {
        return new Cangaceiro();
    }
}