public class Espiao {
    public Espiao(ModeloBuscaWeb modelo) {
        modelo.adicionarObservadorConsulta(new ModeloBuscaWeb.ObservadorConsulta() {
            @Override
            public void aoReceberConsulta(String consulta) {
                if(consulta.toLowerCase().contains("friends")) {
                    System.out.println("Oh Yes! " + consulta);
                }
            }
        }, consulta -> consulta.toLowerCase().contains("friends"));

        modelo.adicionarObservadorConsulta(new ModeloBuscaWeb.ObservadorConsulta() {
            @Override
            public void aoReceberConsulta(String consulta) {
                if(consulta.length() > 60) {
                    System.out.println("So long... " + consulta);
                }
            }
        }, consulta -> consulta.length() > 60);
    }
}

