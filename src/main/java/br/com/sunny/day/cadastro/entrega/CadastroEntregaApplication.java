package br.com.sunny.day.cadastro.entrega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CadastroEntregaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroEntregaApplication.class, args);
	}

}
