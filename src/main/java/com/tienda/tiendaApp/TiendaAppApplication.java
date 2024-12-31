package com.tienda.tiendaApp;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class TiendaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaAppApplication.class, args);
	}

	@Configuration
	public class OpenApiConfig {

		@Bean
		public OpenAPI customOpenAPI() {
			return new OpenAPI()
					.info(new Info()
							.title("API Documentation")
							.version("1.0")
							.description("Documentación de la API generada automáticamente con Swagger/OpenAPI."));
		}
	}
}
