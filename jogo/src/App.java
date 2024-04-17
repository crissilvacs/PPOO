public class App {
    private LocalizacaoFactory localizacaoFactory;

    public App(LocalizacaoFactory localizacaoFactory) {
        this.localizacaoFactory = localizacaoFactory;
    }

    public void iniciarJogo() {
        Inimigo inimigo = localizacaoFactory.criarInimigo();
        inimigo.atacar();
    }

    public static void main(String[] args) {
        App jogoNaAmazonia = new App(new AmazoniaFactory());
        jogoNaAmazonia.iniciarJogo();

        App jogoNoSertao = new App(new SertaoFactory());
        jogoNoSertao.iniciarJogo();

        App jogoNoRio = new App(new RioDeJaneiroFactory());
        jogoNoRio.iniciarJogo();
    }
}
