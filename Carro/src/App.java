public class App {
    public static void main(String[] args) {
        Composite carro = new Composite("Carro", 0);

        Composite carroceria = new Composite("Carroceria", 800);
        carroceria.adicionarComponente(new parteCarro("Para-lamas", 50));
        carroceria.adicionarComponente(new parteCarro("Portas", 70));
        carroceria.adicionarComponente(new parteCarro("Painéis", 30));
        carroceria.adicionarComponente(new parteCarro("Porta-malas", 40));
        carroceria.adicionarComponente(new parteCarro("Capô", 20));

        Composite chassi = new Composite("Chassi", 500);
        Composite tremDeForca = new Composite("Trem de Força", 300);
        tremDeForca.adicionarComponente(new parteCarro("Motor", 250));
        tremDeForca.adicionarComponente(new parteCarro("Transmissão", 100));
        tremDeForca.adicionarComponente(new parteCarro("Diferencial", 75));
        tremDeForca.adicionarComponente(new parteCarro("Rodas", 60));

        chassi.adicionarComponente(tremDeForca);
        chassi.adicionarComponente(new parteCarro("Suspensão", 150));

        carro.adicionarComponente(chassi);
        carro.adicionarComponente(carroceria);


        System.out.println("Peso total do carro: " + carro.getPeso() + " kg");
    }
}

