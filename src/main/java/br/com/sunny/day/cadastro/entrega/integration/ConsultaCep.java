package br.com.sunny.day.cadastro.entrega.integration;

import br.com.sunny.day.cadastro.entrega.domain.dto.Cep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ConsultaCep", url = "${api.external.viacep}")
public interface ConsultaCep {

    @GetMapping(value = "/{cep}/json")
    Cep consulta(@PathVariable("cep") String cep);

}
