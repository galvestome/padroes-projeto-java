package one.digitalinnovation.facade;

import one.digitalinnovation.facade.cep.CepApi;
import one.digitalinnovation.facade.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstania().recuperarCidade(cep);
        String estado = CepApi.getInstania().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
