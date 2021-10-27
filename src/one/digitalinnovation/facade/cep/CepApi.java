package one.digitalinnovation.facade.cep;

import one.digitalinnovation.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstania() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Ribeirão Preto";
    }

    public String recuperarEstado(String cep) {
        return "São Paulo";
    }
}
